package X;

import Y.ARunnableS11S0200100_4;
import Y.ATListenerS338S0200000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446200Hec extends AbstractC21673619ry<C0PV1> {
    public ISearchContextAbility LLILLJJLI;
    public int LLILZIL;
    public List<RelatedWord> LL = C13BV.INSTANCE;
    public int LLILLL = -1;
    public int LLILZ = -1;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(470));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C437310HCv c437310HCv;
        Integer numLIZJ;
        C437310HCv c437310HCv2;
        final C0PV1 c0pv1 = (C0PV1) viewHolder;
        if (C292760Bdi.LIZ()) {
            ((C292750Bdh) this.LLILZLL.getValue()).LIZ = System.currentTimeMillis();
        }
        final RelatedWord relatedWord = (RelatedWord) ListProtector.get(this.LL, i);
        ISearchContextAbility iSearchContextAbility = this.LLILLJJLI;
        int i2 = this.LLILLL;
        int i3 = this.LLILZ;
        c0pv1.LLILZIL = relatedWord;
        if (relatedWord != null) {
            c0pv1.LLILLJJLI = iSearchContextAbility;
            c0pv1.LLILLL = i2;
            c0pv1.LLILZ = i3;
            TuxTextView tuxTextView = c0pv1.LL;
            final Context context = c0pv1.itemView.getContext();
            AbstractViewOnTouchListenerC446430Hez abstractViewOnTouchListenerC446430Hez = new AbstractViewOnTouchListenerC446430Hez(context) { // from class: X.0Hed
                @Override // X.AbstractViewOnTouchListenerC446430Hez
                public final void LIZ(boolean z) {
                    int iIntValue;
                    if (z) {
                        TuxTextView tuxTextView2 = c0pv1.LL;
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a03, c0pv1.itemView.getContext());
                        if (numLIZJ2 != null) {
                            iIntValue = numLIZJ2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        tuxTextView2.setForeground(new ColorDrawable(iIntValue));
                        return;
                    }
                    c0pv1.LL.setForeground(null);
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZ = new InterfaceC446420Hey() { // from class: X.0PV7
                @Override // X.InterfaceC446420Hey
                public final void LIZ() {
                    String str;
                    String str2;
                    String wordSource;
                    C0PCY<C646370PWx> c0pcyWO2;
                    C646370PWx c646370PWx;
                    C0PCY<C0PRC> c0pcyPh1;
                    C0PRC c0prc;
                    C0PV1 c0pv12 = c0pv1;
                    RelatedWord relatedWord2 = relatedWord;
                    c0pv12.getClass();
                    String str3 = C0PJ4.LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT;
                    C653660PkS c653660PkS = new C653660PkS();
                    ISearchContextAbility iSearchContextAbility2 = c0pv12.LLILLJJLI;
                    String str4 = "";
                    if (iSearchContextAbility2 == null || (c0pcyPh1 = iSearchContextAbility2.Ph1()) == null || (c0prc = (C0PRC) c0pcyPh1.LIZJ()) == null || (str = c0prc.LLIZLLLIL) == null) {
                        str = "";
                    }
                    c653660PkS.LJFF = str;
                    ISearchContextAbility iSearchContextAbility3 = c0pv12.LLILLJJLI;
                    if (iSearchContextAbility3 == null || (c0pcyWO2 = iSearchContextAbility3.wO2()) == null || (c646370PWx = (C646370PWx) c0pcyWO2.LIZJ()) == null || (str2 = c646370PWx.LL) == null) {
                        str2 = "";
                    }
                    c653660PkS.LJIIJJI = str2;
                    c653660PkS.LIZ().put("is_inner", CardStruct.IStatusCode.DEFAULT);
                    c653660PkS.LIZ().put("design_type", str3);
                    c653660PkS.LJJIJ = str3;
                    c653660PkS.LJI = "general";
                    View view = c0pv12.itemView;
                    Context context2 = view.getContext();
                    Word word = relatedWord2.wordRecord;
                    if (word != null && (wordSource = word.getWordSource()) != null) {
                        str4 = wordSource;
                    }
                    C670730QSp.LIZIZ(view, context2, c653660PkS, word, str4, null, C0QN9.RS, null, null, null);
                }
            };
            abstractViewOnTouchListenerC446430Hez.LLIZLLLIL = new ATListenerS338S0200000_10(c0pv1, relatedWord, 3);
            tuxTextView.setOnTouchListener(abstractViewOnTouchListenerC446430Hez);
            if (Intrinsics.LJFF("2", relatedWord.wordType)) {
                boolean zBooleanValue = ((Boolean) C04SQ.LIZ.getValue()).booleanValue();
                int i4 = R.raw.icon_arrow_broken_line_up;
                if (zBooleanValue) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C0PV1.LLIZ;
                    c419910GdJ.LIZJ = C0PV1.LLIZLLLIL;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
                    if (!C294620Bgi.LIZIZ) {
                        i4 = R.raw.icon_fire_3_fill;
                    }
                    c419910GdJ.LIZ = i4;
                    C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, c0pv1.itemView.getContext());
                    c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, C426750GoL.LJ(c0pv1.itemView));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                    C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, spannableStringBuilder.length(), 33);
                    TuxTextView tuxTextView2 = c0pv1.LL;
                    if ((tuxTextView2 instanceof C437310HCv) && (c437310HCv2 = (C437310HCv) tuxTextView2) != null) {
                        C437310HCv.LJJJJLL(c437310HCv2, relatedWord.text, spannableStringBuilder, false, 10);
                    }
                } else {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    int i5 = C0PV1.LLIZ;
                    c419910GdJ2.LIZIZ = i5;
                    int i6 = C0PV1.LLIZLLLIL;
                    c419910GdJ2.LIZJ = i6;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a04);
                    if (!C294620Bgi.LIZIZ) {
                        i4 = R.raw.icon_fire_3_fill;
                    }
                    c419910GdJ2.LIZ = i4;
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ2.LIZ(c0pv1.itemView.getContext());
                    tuxIconDrawableLIZ.setBounds(0, 0, i5, i6);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(relatedWord.text);
                    C416750GVt c416750GVt = new C416750GVt(tuxIconDrawableLIZ);
                    c416750GVt.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                    spannableStringBuilder2.append((CharSequence) " ");
                    C786410Ut5.q2(spannableStringBuilder2, c416750GVt, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 18);
                    c0pv1.LL.setText(spannableStringBuilder2);
                }
            } else if (((Boolean) C04SQ.LIZ.getValue()).booleanValue()) {
                TuxTextView tuxTextView3 = c0pv1.LL;
                if ((tuxTextView3 instanceof C437310HCv) && (c437310HCv = (C437310HCv) tuxTextView3) != null) {
                    C437310HCv.LJJJJLL(c437310HCv, relatedWord.text, "", !C1108004Va.LIZ(), 2);
                }
            } else {
                c0pv1.LL.setText(relatedWord.text);
            }
            if (C1821707Bn.LIZ() == 1 || C1821707Bn.LIZ() == 2) {
                TuxTextView tuxTextView4 = c0pv1.LL;
                if (C1821707Bn.LIZ() == 1) {
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1e, tuxTextView4.getContext());
                    if (numLIZJ2 != null) {
                        tuxTextView4.setBackgroundColor(numLIZJ2.intValue());
                    }
                } else if (C1821707Bn.LIZ() == 2 && (numLIZJ = C1308910kAL.LIZJ(R.attr.zr, tuxTextView4.getContext())) != null) {
                    tuxTextView4.setBackgroundColor(numLIZJ.intValue());
                }
            }
        }
        if (C292760Bdi.LIZ()) {
            C292750Bdh c292750Bdh = (C292750Bdh) this.LLILZLL.getValue();
            AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(471);
            c292750Bdh.getClass();
            C0Q8I.INSTANCE.executorService.execute(new ARunnableS11S0200100_4(System.currentTimeMillis() - c292750Bdh.LIZ, c292750Bdh, aFwS192S0000000_6, 0));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        TuxTextView tuxTextView;
        boolean zLJI = MethodIDManager.LJI(202402);
        boolean zLJI2 = MethodIDManager.LJI(202402);
        if (C292760Bdi.LIZ()) {
            ((C292750Bdh) this.LLILZLL.getValue()).LIZ = System.currentTimeMillis();
        }
        int i3 = C0PV1.LLILZLL;
        int i4 = this.LLILZIL;
        int i5 = C2552909zT.LIZ;
        if (i5 != 1) {
            if (i5 != 2) {
                i2 = R.attr.br;
            } else {
                i2 = R.attr.a1f;
            }
        } else {
            i2 = R.attr.a03;
        }
        int iIntValue = 0;
        if (((Boolean) C04SQ.LIZ.getValue()).booleanValue()) {
            tuxTextView = new C437310HCv(viewGroup.getContext(), null, 6);
            tuxTextView.setTextDirection(5);
            tuxTextView.setTextAlignment(5);
            int i6 = C0PV1.LLILZLL;
            tuxTextView.setPaddingRelative(i6, 0, i6, 0);
            tuxTextView.setMaxLines(2);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            Integer numLIZJ = C1308910kAL.LIZJ(i2, viewGroup.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            tuxTextView.setBackgroundColor(iIntValue);
            tuxTextView.setTextColorRes(R.attr.u_);
            tuxTextView.setTuxFont(52);
            tuxTextView.setGravity(8388627);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, i4);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tuxTextView);
            tuxTextView.setLayoutParams(layoutParams);
        } else {
            tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
            tuxTextView.setWidth(-2);
            tuxTextView.setHeight(i4);
            tuxTextView.setTextDirection(5);
            tuxTextView.setTextAlignment(5);
            int i7 = C0PV1.LLILZLL;
            tuxTextView.setPaddingRelative(i7, 0, i7, 0);
            tuxTextView.setMaxLines(2);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            Integer numLIZJ2 = C1308910kAL.LIZJ(i2, viewGroup.getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            }
            tuxTextView.setBackgroundColor(iIntValue);
            tuxTextView.setTextColorRes(R.attr.u_);
            tuxTextView.setTuxFont(52);
            tuxTextView.setGravity(8388627);
        }
        tuxTextView.setId(R.id.uaa);
        C0PV1 c0pv1 = new C0PV1(tuxTextView);
        if (C292760Bdi.LIZ()) {
            C292750Bdh c292750Bdh = (C292750Bdh) this.LLILZLL.getValue();
            AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(472);
            c292750Bdh.getClass();
            C0Q8I.INSTANCE.executorService.execute(new ARunnableS11S0200100_4(System.currentTimeMillis() - c292750Bdh.LIZ, c292750Bdh, aFwS192S0000000_6, 2));
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        try {
            View view = c0pv1.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0pv1.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0pv1.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    e = e;
                }
                try {
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0PV1.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0pv1.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0pv1.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C2081408Dk.LIZ(e3);
            C2344809Gs.LIZ(e3);
        }
        C20612085q.LIZ = C0PV1.class.getName();
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c0pv1;
    }
}
