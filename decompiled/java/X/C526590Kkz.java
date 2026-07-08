package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0Kkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526590Kkz extends AbstractC2255721DQs<InterfaceC525880Kjq> implements InterfaceC525880Kjq {
    public final Map<String, Integer> LL = new LinkedHashMap();
    public final InterfaceC525880Kjq LLILLJJLI = this;
    public final InterfaceC332260D0u<List<TikTokMediaModel>> LLILLL = C1BNE.LIZ(Collections.emptyList());
    public final C05YC<InterfaceC525940Kjw> LLILZ = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);

    @Override // X.InterfaceC525880Kjq
    public List<TikTokMediaModel> m02() {
        return this.LLILLL.getValue();
    }

    @Override // X.InterfaceC525880Kjq
    public void xR() {
        ab2(this.LLILLL.getValue());
    }

    @Override // X.InterfaceC525880Kjq
    public /* bridge */ /* synthetic */ InterfaceC346201Wa G72() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC525880Kjq
    public /* bridge */ /* synthetic */ InterfaceC346201Wa T00() {
        return this.LLILZ;
    }

    public InterfaceC525880Kjq W1() {
        return this.LLILLJJLI;
    }

    public InterfaceC332260D0u<List<TikTokMediaModel>> X1() {
        return this.LLILLL;
    }

    public C05YC<InterfaceC525940Kjw> Z1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC525880Kjq
    public int NE2(TikTokMediaModel tikTokMediaModel) {
        Integer num = this.LL.get(((MediaModel) tikTokMediaModel).id);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC525880Kjq
    public void QG(TikTokMediaModel tikTokMediaModel) {
        List<TikTokMediaModel> value;
        ArrayList arrayList;
        InterfaceC332260D0u<List<TikTokMediaModel>> interfaceC332260D0u = this.LLILLL;
        do {
            value = interfaceC332260D0u.getValue();
            List<TikTokMediaModel> list = value;
            this.LL.remove(((MediaModel) tikTokMediaModel).id);
            Iterator<Map.Entry<String, Integer>> it2 = this.LL.entrySet().iterator();
            int i = 0;
            while (it2.hasNext()) {
                this.LL.put(it2.next().getKey(), Integer.valueOf(i));
                i++;
            }
            arrayList = new ArrayList();
            for (TikTokMediaModel tikTokMediaModel2 : list) {
                if (!Intrinsics.LJFF(((MediaModel) tikTokMediaModel2).id, ((MediaModel) tikTokMediaModel).id)) {
                    arrayList.add(tikTokMediaModel2);
                }
            }
        } while (!interfaceC332260D0u.compareAndSet(value, arrayList));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526570Kkx(this, tikTokMediaModel, null), 3);
    }

    @Override // X.InterfaceC525880Kjq
    public boolean So1(TikTokMediaModel tikTokMediaModel) {
        if (NE2(tikTokMediaModel) >= 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC525880Kjq
    public void ab2(List<? extends TikTokMediaModel> list) {
        List<TikTokMediaModel> value;
        ArrayList arrayList;
        if (list.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<? extends TikTokMediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            hashSet.add(((MediaModel) it2.next()).id);
        }
        C013C c013c = new C013C();
        InterfaceC332260D0u<List<TikTokMediaModel>> interfaceC332260D0u = this.LLILLL;
        do {
            value = interfaceC332260D0u.getValue();
            arrayList = new ArrayList();
            for (TikTokMediaModel tikTokMediaModel : value) {
                if (!hashSet.contains(((MediaModel) tikTokMediaModel).id)) {
                    arrayList.add(tikTokMediaModel);
                }
            }
            this.LL.clear();
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    this.LL.put(((MediaModel) obj).id, Integer.valueOf(i));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c013c.element = arrayList.isEmpty();
        } while (!interfaceC332260D0u.compareAndSet(value, arrayList));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526560Kkw(this, list, c013c, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC525880Kjq
    public TikTokMediaModel Cv1(int i, int i2) {
        boolean z;
        List<TikTokMediaModel> value;
        ArrayList arrayList;
        List<TikTokMediaModel> value2 = this.LLILLL.getValue();
        boolean z2 = true;
        if (i >= 0 && i < value2.size()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 < 0 || i2 >= value2.size()) {
            z2 = false;
        }
        if (!z || !z2) {
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        InterfaceC332260D0u<List<TikTokMediaModel>> interfaceC332260D0u = this.LLILLL;
        do {
            value = interfaceC332260D0u.getValue();
            arrayList = new ArrayList(value);
            ?? Remove = ListProtector.remove(arrayList, i);
            c259800zU.element = Remove;
            ListProtector.add(arrayList, i2, Remove);
            this.LL.clear();
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    this.LL.put(((MediaModel) obj).id, Integer.valueOf(i3));
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } while (!interfaceC332260D0u.compareAndSet(value, arrayList));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526550Kkv(this, i, i2, c259800zU, null), 3);
        return (TikTokMediaModel) c259800zU.element;
    }

    @Override // X.InterfaceC525880Kjq
    public void eo0(List<? extends TikTokMediaModel> list, C0L90 c0l90) {
        List<TikTokMediaModel> value;
        List<TikTokMediaModel> list2;
        if (list.isEmpty()) {
            return;
        }
        EventBus.LIZLLL().LJIILL(new C526610Kl1());
        InterfaceC332260D0u<List<TikTokMediaModel>> interfaceC332260D0u = this.LLILLL;
        do {
            value = interfaceC332260D0u.getValue();
            list2 = value;
            int i = 0;
            for (TikTokMediaModel tikTokMediaModel : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    this.LL.put(((MediaModel) tikTokMediaModel).id, Integer.valueOf(list2.size() + i));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } while (!interfaceC332260D0u.compareAndSet(value, C13LP.LJLIL(list, list2)));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526580Kky(this, list, null), 3);
    }

    @Override // X.InterfaceC525880Kjq
    public void id0(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
        List<TikTokMediaModel> value;
        ArrayList arrayList;
        Iterator<TikTokMediaModel> it2 = m02().iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((MediaModel) it2.next()).id, ((MediaModel) tikTokMediaModel).id)) {
                if (i >= 0) {
                    InterfaceC332260D0u<List<TikTokMediaModel>> interfaceC332260D0u = this.LLILLL;
                    do {
                        value = interfaceC332260D0u.getValue();
                        arrayList = new ArrayList(value);
                        ListProtector.set(arrayList, i, tikTokMediaModel);
                    } while (!interfaceC332260D0u.compareAndSet(value, arrayList));
                    return;
                }
            } else {
                i++;
            }
        }
        qJ(tikTokMediaModel, c0l90);
    }

    @Override // X.InterfaceC525880Kjq
    public void qJ(TikTokMediaModel tikTokMediaModel, C0L90 c0l90) {
        List<TikTokMediaModel> value;
        List<TikTokMediaModel> list;
        EventBus.LIZLLL().LJIILL(new C526610Kl1());
        InterfaceC332260D0u<List<TikTokMediaModel>> interfaceC332260D0u = this.LLILLL;
        do {
            value = interfaceC332260D0u.getValue();
            list = value;
            this.LL.put(((MediaModel) tikTokMediaModel).id, Integer.valueOf(list.size()));
        } while (!interfaceC332260D0u.compareAndSet(value, C13LP.LJLILLLLZI(tikTokMediaModel, list)));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526600Kl0(this, tikTokMediaModel, null), 3);
    }
}
