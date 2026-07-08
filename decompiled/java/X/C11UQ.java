package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.EffectTextEffectExtra;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11UQ extends AbstractC21673619ry<C11UR> {
    public final List<C11UK> LL;
    public final C11UV<C11UK> LLILLJJLI;
    public final C11UV<C2280608we> LLILLL;
    public final Function1<C11UK, Unit> LLILZ;
    public int LLILZIL;
    public final boolean LLILZLL = C297840Blu.LIZ();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        boolean z2;
        C11US c11us;
        C11UR c11ur = (C11UR) viewHolder;
        if (this.LL.size() > i) {
            C11UK c11uk = (C11UK) ListProtector.get(c11ur.LLILZIL.LL, i);
            EffectTextEffectExtra effectTextEffectExtra = c11uk.LLILLL;
            boolean z3 = effectTextEffectExtra.LIZ;
            Integer numValueOf = Integer.valueOf(R.attr.a1h);
            if (z3) {
                C1324800kZy imageView = c11ur.LL.getImageView();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_circle_slash;
                c419910GdJ.LJ = numValueOf;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                imageView.setImageDrawable(c419910GdJ.LIZ(c11ur.LL.getContext()));
            } else if (effectTextEffectExtra.ifStandard) {
                C1324800kZy imageView2 = c11ur.LL.getImageView();
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_text_latin;
                c419910GdJ2.LJ = numValueOf;
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
                imageView2.setImageDrawable(c419910GdJ2.LIZ(c11ur.LL.getContext()));
            } else {
                UrlModel urlModel = new UrlModel();
                com.ss.android.ugc.effectmanager.common.model.UrlModel iconUrl = c11uk.effect.getIconUrl();
                urlModel.setUri(iconUrl.getUri());
                urlModel.setUrlList(iconUrl.getUrlList());
                C1324750kZt.LJI(c11ur.LL.getImageView(), urlModel, -1, -1);
            }
            c11ur.LL.setText(c11uk.effect.getName());
            c11ur.LL.getImageView().setBackgroundResource(R.drawable.bqv);
            C1662870tNF c1662870tNF = c11ur.LL;
            if (c11ur.getAdapterPosition() == c11ur.LLILZIL.LLILZIL) {
                z = true;
            } else {
                z = false;
            }
            c1662870tNF.setCustomSelected(z);
            if (c11ur.LLILZIL.LLILZLL) {
                C786410Ut5.LJZI(8, c11ur.LLILLJJLI);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(c11ur.LLILZIL.LLILLJJLI.LIZ(c11uk)));
            Set<C2280608we> set = c11uk.LLILLJJLI;
            C11UQ c11uq = c11ur.LLILZIL;
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(c11uq.LLILLL.LIZ((C11UL) it2.next())));
            }
            C11UW c11uw = C11US.Companion;
            int iLIZ = C1180204jY.LIZ(arrayList);
            c11uw.getClass();
            if (iLIZ == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c11us = C11US.DOWNLOADING;
            } else if (iLIZ != 2 && iLIZ != 1 && iLIZ != 32) {
                if (iLIZ != 4 && iLIZ != 16) {
                    c11us = C11US.NOT_DOWNLOAD;
                } else {
                    c11us = C11US.DOWNLOADED;
                }
            } else {
                c11us = C11US.NOT_DOWNLOAD;
            }
            c11ur.LLILLL = c11us;
            if (!c11ur.LLILZIL.LLILZLL) {
                int i2 = C11UT.LIZ[c11us.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            C786410Ut5.LJZI(0, c11ur.LLILLJJLI);
                            c11ur.I5();
                            return;
                        } else {
                            C786410Ut5.LJZI(0, c11ur.LLILLJJLI);
                            c11ur.LLILLJJLI.setImageResource(R.drawable.bym);
                            C786410Ut5.Pd((ObjectAnimator) c11ur.LLILZ.getValue());
                            return;
                        }
                    }
                    C786410Ut5.LJZI(8, c11ur.LLILLJJLI);
                    c11ur.I5();
                    return;
                }
                C786410Ut5.LJZI(0, c11ur.LLILLJJLI);
                c11ur.I5();
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c4t, viewGroup, false);
        final Context context = viewTd.getContext();
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(viewTd, 502);
        C11UU c11uu = new C11UU(context);
        awS608S0100000_29.invoke(c11uu);
        final boolean z = c11uu.LIZ;
        final int i2 = c11uu.LIZIZ;
        final int i3 = c11uu.LIZJ;
        final int i4 = c11uu.LIZLLL;
        final boolean z2 = c11uu.LJ;
        final boolean z3 = c11uu.LJFF;
        C1662870tNF c1662870tNF = new C1662870tNF(context, z, i2, i3, i4, z2, z3) { // from class: X.0tNI
            @Override // X.C1662870tNF
            public final View LJFF(Context context2) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                C19518211Xw c19518211Xw = new C19518211Xw(context2, null);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19518211Xw);
                c19518211Xw.setLayoutParams(layoutParams);
                c19518211Xw.setGravity(17);
                c19518211Xw.setTextColor(C960203pA.LIZ(R.attr.a1h, context2));
                return c19518211Xw;
            }
        };
        if (C12VA.LIZ().LJFF) {
            TextView textView = c1662870tNF.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = c1662870tNF.getTextView();
            if (textView2 != null) {
                C19734012Iw.LIZJ(textView2);
            }
        } else {
            TextView textView3 = c1662870tNF.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = c1662870tNF.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1662870tNF);
        c1662870tNF.setLayoutParams(layoutParams);
        c1662870tNF.setId(R.id.lge);
        ((ViewGroup) viewTd.findViewById(R.id.i5q)).addView(c1662870tNF, 0);
        C11UR c11ur = new C11UR(this, viewTd);
        try {
            View view = c11ur.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c11ur.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c11ur.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C11UR.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c11ur.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c11ur.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C11UR.class.getName();
        return c11ur;
    }

    public C11UQ(List list, C11UX c11ux, C11UX c11ux2, AwS608S0100000_29 awS608S0100000_29) {
        this.LL = list;
        this.LLILLJJLI = c11ux;
        this.LLILLL = c11ux2;
        this.LLILZ = awS608S0100000_29;
    }
}
