package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhihu.matisse.R;
import com.zhihu.matisse.internal.entity.Item;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.140t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201965140t {
    public final Context LIZ;
    public Set<Item> LIZIZ;
    public int LIZJ;

    public final Bundle LIZJ() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIL(bundle, "state_selection", new ArrayList(this.LIZIZ));
        bundle.putInt("state_collection_type", this.LIZJ);
        return bundle;
    }

    public final boolean LJ() {
        int i;
        int size = this.LIZIZ.size();
        int i2 = C20149313sh.LIZ.LJI;
        if (i2 <= 0 && ((i = this.LIZJ) == 1 || i == 2)) {
            i2 = 0;
        }
        return size == i2;
    }

    public C201965140t(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(Item item) {
        if (!LJII(item)) {
            if (this.LIZIZ.add(item)) {
                int i = this.LIZJ;
                if (i == 0) {
                    if (item.LIZIZ()) {
                        this.LIZJ = 1;
                        return;
                    } else {
                        if (!item.LIZJ()) {
                            return;
                        }
                        this.LIZJ = 2;
                        return;
                    }
                }
                if (i == 1) {
                    if (!item.LIZJ()) {
                        return;
                    }
                    this.LIZJ = 3;
                    return;
                } else {
                    if (i != 2 || !item.LIZIZ()) {
                        return;
                    }
                    this.LIZJ = 3;
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Can't select images and videos at the same time.");
    }

    public final int LIZIZ(Item item) {
        int iIndexOf = new ArrayList(this.LIZIZ).indexOf(item);
        if (iIndexOf == -1) {
            return Integer.MIN_VALUE;
        }
        return iIndexOf + 1;
    }

    public final AnonymousClass1474 LIZLLL(Item item) {
        String string;
        int i;
        if (LJ()) {
            int i2 = C20149313sh.LIZ.LJI;
            if (i2 <= 0 && ((i = this.LIZJ) == 1 || i == 2)) {
                i2 = 0;
            }
            try {
                string = this.LIZ.getResources().getQuantityString(R.plurals.matisse_error_over_count, i2, Integer.valueOf(i2));
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                string = this.LIZ.getString(2131837077, Integer.valueOf(i2));
            } catch (NoClassDefFoundError e2) {
                TryCatchGuardChecker.doCheck(e2);
                string = this.LIZ.getString(2131837077, Integer.valueOf(i2));
            }
            return new AnonymousClass1474(string);
        }
        if (LJII(item)) {
            return new AnonymousClass1474(this.LIZ.getString(2131837082));
        }
        Context context = this.LIZ;
        if (context != null) {
            ContentResolver contentResolver = context.getContentResolver();
            Iterator<C140W> it2 = C20149313sh.LIZ.LIZ.iterator();
            while (it2.hasNext()) {
                if (it2.next().checkType(context, contentResolver, item.uri)) {
                    List<AbstractC201966140u> list = C20149313sh.LIZ.LJII;
                    if (list != null) {
                        Iterator it3 = ((ArrayList) list).iterator();
                        while (it3.hasNext()) {
                            AnonymousClass1474 anonymousClass1474LIZ = ((AbstractC201966140u) it3.next()).LIZ(context, item);
                            if (anonymousClass1474LIZ != null) {
                                return anonymousClass1474LIZ;
                            }
                        }
                        return null;
                    }
                    return null;
                }
            }
        }
        return new AnonymousClass1474(context.getString(2131837075));
    }

    public final void LJFF(Bundle bundle) {
        if (bundle == null) {
            this.LIZIZ = new LinkedHashSet();
        } else {
            this.LIZIZ = new LinkedHashSet(bundle.getParcelableArrayList("state_selection"));
            this.LIZJ = bundle.getInt("state_collection_type", 0);
        }
    }

    public final void LJI(Item item) {
        if (this.LIZIZ.remove(item)) {
            boolean z = false;
            if (this.LIZIZ.size() == 0) {
                this.LIZJ = 0;
                return;
            }
            if (this.LIZJ != 3) {
                return;
            }
            boolean z2 = false;
            for (Item item2 : this.LIZIZ) {
                if (item2.LIZIZ() && !z) {
                    z = true;
                }
                if (item2.LIZJ() && !z2) {
                    z2 = true;
                }
            }
            if (z) {
                if (z2) {
                    this.LIZJ = 3;
                    return;
                } else {
                    this.LIZJ = 1;
                    return;
                }
            }
            if (!z2) {
                return;
            }
            this.LIZJ = 2;
        }
    }

    public final boolean LJII(Item item) {
        int i;
        if (C20149313sh.LIZ.LIZIZ) {
            if (!item.LIZIZ() || ((i = this.LIZJ) != 2 && i != 3)) {
                if (item.LIZJ()) {
                    int i2 = this.LIZJ;
                    if (i2 != 1 && i2 != 3) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
