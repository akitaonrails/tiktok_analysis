package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic.SelectSegmentInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383760F2w extends AbstractC21673619ry<C383750F2v> {
    public final C0F3A LL;
    public final List<SelectSegmentInfo> LLILLJJLI = new ArrayList();
    public int LLILLL = -1;
    public C0F3C LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C383760F2w(C0F3A c0f3a) {
        this.LL = c0f3a;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        int i2;
        final C383750F2v c383750F2v = (C383750F2v) viewHolder;
        final SelectSegmentInfo selectSegmentInfo = (SelectSegmentInfo) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (selectSegmentInfo != null) {
            c383750F2v.LL.setText(C786410Ut5.k4(Locale.ENGLISH, "%.1fs", Arrays.copyOf(new Object[]{Float.valueOf(C352310DrZ.LIZIZ(selectSegmentInfo.duration))}, 1)));
            View view = c383750F2v.LLILLL;
            int i3 = 8;
            if (i == this.LLILLL) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
            View view2 = c383750F2v.LLILZ;
            if (i != this.LLILLL) {
                i3 = 0;
            }
            C786410Ut5.LJLLLLLL(i3, view2);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0F2x
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view3) {
                    Iterator it2 = ((ArrayList) this.LLILZ.LLILLJJLI).iterator();
                    while (it2.hasNext()) {
                        ((SelectSegmentInfo) it2.next()).setSelect(false);
                    }
                    ((SelectSegmentInfo) ListProtector.get(this.LLILZ.LLILLJJLI, i)).setSelect(true);
                    C383760F2w c383760F2w = this.LLILZ;
                    c383760F2w.LLILLL = i;
                    c383760F2w.notifyDataSetChanged();
                    C0F3C c0f3c = this.LLILZ.LLILZ;
                    if (c0f3c != null) {
                        c0f3c.LIZ.LLLLIL().n(i);
                    }
                }
            }, c383750F2v.LLILLJJLI);
            C370720EgA.LIZ.getClass();
            final int iLIZ = C370720EgA.LIZ(0);
            Bitmap bitmapLIZIZ = this.LL.LIZIZ(iLIZ, selectSegmentInfo.path);
            if (bitmapLIZIZ != null) {
                c383750F2v.LLILLJJLI.setImageBitmap(bitmapLIZIZ);
            } else {
                this.LL.LIZJ(new InterfaceC358400E3i() { // from class: X.0F2y
                    @Override // X.InterfaceC358400E3i
                    public final boolean LIZ(int i4, String str) {
                        if (Intrinsics.LJFF(str, selectSegmentInfo.path) && i4 == iLIZ) {
                            c383750F2v.LLILLJJLI.setImageBitmap(this.LL.LIZIZ(i4, str));
                            return true;
                        }
                        return false;
                    }
                });
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C383750F2v c383750F2v = new C383750F2v(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c1v, viewGroup, false));
        try {
            View view = c383750F2v.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c383750F2v.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c383750F2v.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C383750F2v.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c383750F2v.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c383750F2v.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C383750F2v.class.getName();
        return c383750F2v;
    }
}
