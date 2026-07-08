package X;

import Y.ACListenerS119S0200000_16;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dWI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053440dWI extends AbstractC683590Qrd<AbstractC1053500dWO> {
    public final Context LL;
    public final InterfaceC1053520dWQ LLILLJJLI;
    public final Integer LLILLL;
    public final boolean LLILZ;
    public final Function0<Unit> LLILZIL;

    public final void LLLFZ() {
        List<AbstractC1053500dWO> data = getData();
        if (data != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (AbstractC1053500dWO abstractC1053500dWO : data) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                if ((abstractC1053500dWO instanceof C1053460dWK) && i2 < data.size()) {
                    Object obj = ListProtector.get(data, i2);
                    if (obj instanceof C1053460dWK) {
                        arrayList.add(Integer.valueOf(i));
                    } else if (obj instanceof C1053420dWG) {
                        arrayList.add(Integer.valueOf(i2));
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                i = i2;
            }
            Iterator it2 = C13LP.LJLLL(arrayList).iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                ListProtector.remove(data, iIntValue);
                notifyItemRemoved(iIntValue);
            }
        }
    }

    @Override // X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        AbstractC1053500dWO abstractC1053500dWO;
        List<AbstractC1053500dWO> data = getData();
        if (data != null && (abstractC1053500dWO = (AbstractC1053500dWO) ListProtector.get(data, i)) != null) {
            return abstractC1053500dWO.LIZ();
        }
        return 0;
    }

    @Override // X.AbstractC683590Qrd
    public final void setDataAfterLoadMore(List<AbstractC1053500dWO> list) {
        if (list != null && !list.isEmpty()) {
            List<AbstractC1053500dWO> data = getData();
            if (data != null) {
                data.addAll(list);
            }
            super.setDataAfterLoadMore(getData());
        }
    }

    @Override // X.AbstractC438050HFr
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final AbstractC1053500dWO abstractC1053500dWO;
        C1053490dWN c1053490dWN;
        int i2;
        float f;
        C1053470dWL c1053470dWL;
        C1053510dWP c1053510dWP;
        TuxTextView tuxTextView;
        List<AbstractC1053500dWO> data = getData();
        if (data != null && (abstractC1053500dWO = (AbstractC1053500dWO) ListProtector.get(data, i)) != null) {
            boolean z = abstractC1053500dWO instanceof C1053410dWF;
            if (z) {
                C786410Ut5.I7(new ACListenerS119S0200000_16(abstractC1053500dWO, this, 28), viewHolder.itemView);
                viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0dWM
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        this.LL.LLILLJJLI.Qn((C1053410dWF) abstractC1053500dWO);
                        return true;
                    }
                });
            }
            SmartImageView smartImageView = null;
            if (abstractC1053500dWO instanceof C1053460dWK) {
                if ((viewHolder instanceof C1053510dWP) && (c1053510dWP = (C1053510dWP) viewHolder) != null && (tuxTextView = c1053510dWP.LL) != null) {
                    tuxTextView.setText(((C1053460dWK) abstractC1053500dWO).LIZ);
                    return;
                }
                return;
            }
            if (z) {
                if (viewHolder instanceof C1053470dWL) {
                    c1053470dWL = (C1053470dWL) viewHolder;
                    if (c1053470dWL != null) {
                        TuxTextView tuxTextView2 = c1053470dWL.LL;
                        if (tuxTextView2 != null) {
                            tuxTextView2.setText(((C1053410dWF) abstractC1053500dWO).LIZ);
                        }
                        TuxTextView tuxTextView3 = c1053470dWL.LLILLJJLI;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(((C1053410dWF) abstractC1053500dWO).LIZIZ);
                        }
                        TuxTextView tuxTextView4 = c1053470dWL.LLILLL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setText(((C1053410dWF) abstractC1053500dWO).LIZJ);
                        }
                    }
                } else {
                    c1053470dWL = null;
                }
                final C1053410dWF c1053410dWF = (C1053410dWF) abstractC1053500dWO;
                if (c1053470dWL != null) {
                    smartImageView = c1053470dWL.LLILZ;
                }
                String strLIZ = c1053410dWF.LIZLLL;
                if (smartImageView == null) {
                    return;
                }
                final Drawable drawableLLLI = LLLI(R.raw.icon_globe_fill, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)), this.LL);
                Drawable drawableLLLI2 = LLLI(R.raw.icon_circle_slash, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(33)), this.LL);
                Integer num = c1053410dWF.LJIIJ;
                if (num != null && num.intValue() == 2) {
                    smartImageView.setScaleType(ImageView.ScaleType.CENTER);
                    smartImageView.setImageDrawable(drawableLLLI2);
                    C1053390dWD.LIZ(0, c1053410dWF, this.LLILLL);
                    return;
                }
                if (strLIZ != null && !a0.LJJJIL(strLIZ)) {
                    if (Intrinsics.LJFF(c1053410dWF.LJIIJJI, Boolean.FALSE)) {
                        strLIZ = C2215608mA.LIZ(strLIZ, "x-tt-pns-dt-pass-id", "10080004");
                    }
                    if (Intrinsics.LJFF(smartImageView.getTag(R.id.jpn), strLIZ)) {
                        return;
                    }
                    smartImageView.setScaleType(ImageView.ScaleType.CENTER);
                    smartImageView.setImageDrawable(drawableLLLI);
                    InterfaceC427850Gq7 interfaceC427850Gq7 = new InterfaceC427850Gq7() { // from class: X.0dWJ
                        @Override // X.InterfaceC427850Gq7
                        public final void A3(Uri uri, C428600GrK c428600GrK) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Bh(Uri uri, View view) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void e1(Uri uri) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void lg(Uri uri, Throwable th) {
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void cm(Uri uri, View view, Throwable th) {
                            if (!(view instanceof ImageView)) {
                                return;
                            }
                            ImageView imageView = (ImageView) view;
                            imageView.setTag(R.id.jpn, String.valueOf(uri));
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageDrawable(drawableLLLI);
                            C1053390dWD.LIZ(1, c1053410dWF, this.LLILLL);
                        }

                        @Override // X.InterfaceC427850Gq7
                        public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                            if (view != null) {
                                view.setTag(R.id.jpn, String.valueOf(uri));
                            }
                        }
                    };
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZ);
                    c1331670kl3LJIIIZ.LJIILJJIL = 0;
                    c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
                    c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.FIT_CENTER;
                    c1331670kl3LJIIIZ.LJJ(smartImageView);
                    c1331670kl3LJIIIZ.LJIIJ(interfaceC427850Gq7);
                    return;
                }
                smartImageView.setScaleType(ImageView.ScaleType.CENTER);
                smartImageView.setImageDrawable(drawableLLLI);
                C1053390dWD.LIZ(1, c1053410dWF, this.LLILLL);
                return;
            }
            if (abstractC1053500dWO instanceof C1053420dWG) {
                if (!(viewHolder instanceof C1053490dWN) || (c1053490dWN = (C1053490dWN) viewHolder) == null) {
                    return;
                }
                C1053420dWG c1053420dWG = (C1053420dWG) abstractC1053500dWO;
                Function0<Unit> function0 = this.LLILZIL;
                TuxTextView tuxTextView5 = c1053490dWN.LL;
                if (tuxTextView5 != null) {
                    if (c1053420dWG.LIZ) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView5, i2);
                    tuxTextView5.setEnabled(c1053420dWG.LIZIZ);
                    if (c1053420dWG.LIZIZ) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    C786410Ut5.B5(tuxTextView5, f);
                    C786410Ut5.h9(tuxTextView5, new ACListenerS119S0200000_16(c1053420dWG, function0, 29));
                }
                C786410Ut5.LLLLZLL(c1053490dWN.LLILLJJLI, 0);
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.AbstractC438050HFr
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return new C1053490dWN(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.lq, viewGroup, false));
            }
            return new C1053470dWL(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.lr, viewGroup, false));
        }
        return new C1053510dWP(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ls, viewGroup, false));
    }

    public static Drawable LLLI(int i, int i2, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i2;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
    }

    public C1053440dWI(Context context, InterfaceC1053520dWQ interfaceC1053520dWQ, Integer num, boolean z, AwS560S0100000_16 awS560S0100000_16) {
        super(false);
        this.LL = context;
        this.LLILLJJLI = interfaceC1053520dWQ;
        this.LLILLL = num;
        this.LLILZ = z;
        this.LLILZIL = awS560S0100000_16;
    }
}
