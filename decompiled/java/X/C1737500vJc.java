package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS93S0100000_26;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS427S0200000_26;

/* JADX INFO: renamed from: X.0vJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737500vJc extends AbstractC21673619ry<C1737510vJd> {
    public final List<C1737450vJX> LL = new ArrayList();
    public InterfaceC1737580vJk LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final void LLLFZ(C1737450vJX c1737450vJX) {
        C0CNO.LIZLLL(0L, new AwS427S0200000_26(this, c1737450vJX, 85));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String string;
        C1737510vJd c1737510vJd = (C1737510vJd) viewHolder;
        C1737450vJX c1737450vJX = (C1737450vJX) C1904807d8.LIZ(i, this.LL);
        if (c1737450vJX != null) {
            c1737510vJd.LLILLJJLI = this.LLILLJJLI;
            c1737510vJd.LLILLL = c1737450vJX;
            TuxTextView tuxTextView = c1737510vJd.LLILZ;
            EnumC1736950vIj enumC1736950vIj = c1737450vJX.LIZ;
            Context context = c1737510vJd.LL.getContext();
            int i2 = C1736900vIe.LIZ[enumC1736950vIj.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    string = "";
                } else {
                    string = context.getString(2131821252);
                }
            } else {
                string = context.getString(2131821253);
            }
            tuxTextView.setText(string);
            if (c1737450vJX.LIZLLL) {
                C337180DJs.LIZ(c1737510vJd.LLILZ);
            }
            int i3 = C1737520vJe.LIZ[c1737450vJX.LIZIZ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            c1737510vJd.I5(false);
                            C1322110kVd c1322110kVd = c1737510vJd.LLILZIL;
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                            c1322110kVd.setBackground(c384050F3z.LIZ(c1322110kVd.getContext()));
                            c1322110kVd.setScaleType(ImageView.ScaleType.CENTER);
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_image_alt_1_fill;
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a01);
                            c1322110kVd.setImageDrawable(c419910GdJ.LIZ(c1322110kVd.getContext()));
                            C786410Ut5.I7(new AkS93S0100000_26(c1737510vJd, 12), c1322110kVd);
                            FrameLayout frameLayout = c1737510vJd.LLIZLLLIL;
                            frameLayout.setBackground(C1736510vI1.LIZJ(frameLayout.getContext()));
                            C786410Ut5.LJZ(0, frameLayout);
                            C786410Ut5.I7(new AkS93S0100000_26(c1737510vJd, 13), frameLayout);
                            c1737510vJd.LLILZLL.setTuxIcon(C1736510vI1.LIZIZ());
                            return;
                        }
                        throw new C1954807lC();
                    }
                    c1737510vJd.I5(false);
                    C1324750kZt.LJIIIZ(c1737510vJd.LLILZIL, c1737450vJX.LIZJ, -1, -1);
                    C786410Ut5.I7(new AkS93S0100000_26(c1737510vJd, 10), c1737510vJd.LLILZIL);
                    FrameLayout frameLayout2 = c1737510vJd.LLIZLLLIL;
                    frameLayout2.setBackground(C1736510vI1.LIZJ(frameLayout2.getContext()));
                    C786410Ut5.LJZ(0, frameLayout2);
                    C786410Ut5.I7(new AkS93S0100000_26(c1737510vJd, 11), frameLayout2);
                    c1737510vJd.LLILZLL.setTuxIcon(C1736510vI1.LIZIZ());
                    return;
                }
                c1737510vJd.I5(true);
                return;
            }
            c1737510vJd.I5(false);
            C786410Ut5.LJZ(4, c1737510vJd.LLIZLLLIL);
            Context context2 = c1737510vJd.LL.getContext();
            if (context2 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_plus_small;
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ2.LIZ(context2);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z2.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
                LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z2.LIZ(context2));
                if (layerDrawableLJIILIIL != null) {
                    c1737510vJd.LLILZIL.setImageDrawable(layerDrawableLJIILIIL);
                }
            }
            C786410Ut5.I7(new AkS93S0100000_26(c1737510vJd, 9), c1737510vJd.LLILZIL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1737510vJd c1737510vJd = new C1737510vJd(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cz5, null, false));
        try {
            View view = c1737510vJd.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1737510vJd.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1737510vJd.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1737510vJd.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1737510vJd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1737510vJd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1737510vJd.class.getName();
        return c1737510vJd;
    }
}
