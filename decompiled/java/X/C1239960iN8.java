package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS2S0311000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iN8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239960iN8 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public List<BaseLoginMethod> LL;
    public final InterfaceC1240000iNC LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Function0<Unit> LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ = true;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return (!this.LLIZ || this.LLILZLL) ? this.LL.size() : this.LL.size() + 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == this.LL.size()) {
            return 2;
        }
        if (i == this.LL.size() - 1) {
            return 3;
        }
        return 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LLLFZ(Context context, String str) {
        switch (str.hashCode()) {
            case -1343791663:
                if (!str.equals("USER_NAME_PASS")) {
                    return "";
                }
                return context.getString(2131838735);
            case -1240244679:
                if (!str.equals("google")) {
                    return "";
                }
                return context.getString(2131838767);
            case -916346253:
                if (!str.equals("twitter")) {
                    return "";
                }
                return context.getString(2131838769);
            case -74055538:
                if (!str.equals("PASSKEY")) {
                    return "";
                }
                return context.getString(2131838752);
            case 3765:
                if (!str.equals("vk")) {
                    return "";
                }
                return context.getString(2131838764);
            case 3321844:
                if (!str.equals("line")) {
                    return "";
                }
                return context.getString(2131838763);
            case 28903346:
                if (!str.equals("instagram")) {
                    return "";
                }
                return context.getString(2131838761);
            case 78744022:
                if (!str.equals("PHONE_NUMBER_PASS")) {
                    return "";
                }
                return context.getString(2131838768);
            case 323062851:
                if (!str.equals("google_onetap")) {
                    return "";
                }
                return context.getString(2131838767);
            case 486515695:
                if (!str.equals("kakaotalk")) {
                    return "";
                }
                return context.getString(2131838762);
            case 497130182:
                if (!str.equals("facebook")) {
                    return "";
                }
                return context.getString(2131838766);
            case 1758879432:
                if (!str.equals("PHONE_SMS")) {
                    return "";
                }
                return context.getString(2131838768);
            case 1833209588:
                if (!str.equals("EMAIL_PASS")) {
                    return "";
                }
                return context.getString(2131838765);
            case 1997837473:
                if (!str.equals("m_twitter")) {
                    return "";
                }
                return context.getString(2131838769);
            default:
                return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022f A[PHI: r0
      0x022f: PHI (r0v36 java.lang.String) = (r0v34 java.lang.String), (r0v61 java.lang.String) binds: [B:92:0x022b, B:47:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, int r15) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1239960iN8.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1239970iN9;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    c1239970iN9 = new C1239970iN9(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.yv, viewGroup, false), false);
                } else {
                    c1239970iN9 = new C1239970iN9(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.yv, viewGroup, false), true);
                }
            } else {
                final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.yu, viewGroup, false);
                c1239970iN9 = new RecyclerView.ViewHolder(this, viewTd) { // from class: X.0Dbq
                    public final View LL;

                    {
                        super(viewTd);
                        this.LL = viewTd;
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewTd.findViewById(R.id.tqy);
                        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.jxe);
                        Context context = viewTd.getContext();
                        if (context != null) {
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                            c419910GdJ.LIZ = R.raw.icon_plus;
                            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
                            C384050F3z c384050F3z = new C384050F3z();
                            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
                            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
                            if (tuxIconView != null) {
                                tuxIconView.setImageDrawable(layerDrawableLJIILIIL);
                            }
                        }
                        if (constraintLayout != null) {
                            C786410Ut5.Y7(constraintLayout, new ACListenerS139S0100000_4(this, 6));
                        }
                    }
                };
            }
        } else {
            final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.zv, viewGroup, false);
            c1239970iN9 = new RecyclerView.ViewHolder(viewTd2) { // from class: X.0iNB
                public final View LL;

                {
                    super(viewTd2);
                    this.LL = viewTd2;
                }
            };
        }
        try {
            View view = c1239970iN9.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1239970iN9.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1239970iN9.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1239970iN9.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1239970iN9.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1239970iN9.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1239970iN9.getClass().getName();
        return c1239970iN9;
    }

    public final void LLLI(int i, Context context, BaseLoginMethod baseLoginMethod, boolean z) {
        BaseLoginMethod baseLoginMethod2 = baseLoginMethod;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        if (baseLoginMethod2 == null) {
            baseLoginMethod2 = (BaseLoginMethod) ListProtector.get(this.LL, i);
        }
        c1397580mTM.LJFF(2131838759);
        c1397580mTM.LJII = false;
        c1397580mTM.LIZ(2131838757);
        C985403tE.LIZ(c1397580mTM, new AwS2S0311000_19(i, z, baseLoginMethod2, this, context, 0));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public C1239960iN8(List list, C1240050iNH c1240050iNH, String str, String str2, AwS563S0100000_19 awS563S0100000_19) {
        this.LL = list;
        this.LLILLJJLI = c1240050iNH;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = awS563S0100000_19;
    }
}
