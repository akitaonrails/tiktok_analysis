package X;

import Y.ACListenerS32S0100100_16;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS113S0400000_16;

/* JADX INFO: renamed from: X.0cZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016940cZQ extends FrameLayout {
    public RadiusLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public C418860Gbc LLILZ;

    public C1016940cZQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final RadiusLayout getAiComponentEntrance() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tni);
            this.LL = (RadiusLayout) callbackFindViewById;
        }
        return (RadiusLayout) callbackFindViewById;
    }

    private final TuxIconView getIvAiComponentButtonIcon() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lkc);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    private final C418860Gbc getIvAiComponentButtonIconHighLight() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lkd);
            this.LLILZ = (C418860Gbc) callbackFindViewById;
        }
        return (C418860Gbc) callbackFindViewById;
    }

    private final TuxTextView getTvAiComponentEntrance() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z91);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C418860Gbc getAiComponentButtonHighlightIcon() {
        return getIvAiComponentButtonIconHighLight();
    }

    public final TuxIconView getAiComponentButtonIcon() {
        return getIvAiComponentButtonIcon();
    }

    public C1016940cZQ(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.lj, this, true);
    }

    public final void LIZ(SparkContext sparkContext, Float f, EfficiencyComponents efficiencyComponents) {
        C1035880d3y c1035880d3y;
        String str;
        int size;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer numLIZJ;
        String str6;
        String str7;
        InterfaceC1036110d4L interfaceC1036110d4L;
        List<String> list;
        List<String> list2;
        String str8;
        float fLIZJ;
        C698190Ra5 c698190Ra5LJFF = null;
        if (sparkContext != null) {
            c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
        } else {
            c1035880d3y = null;
        }
        float fIntValue = 24.0f;
        if (f != null) {
            f.floatValue();
            float fFloatValue = f.floatValue();
            if (efficiencyComponents != null) {
                str8 = efficiencyComponents.leftIcon;
            } else {
                str8 = null;
            }
            if (C1533610q0l.LIZIZ(str8)) {
                fLIZJ = C12ES.LIZJ(24.0f, getContext());
            } else {
                fLIZJ = 0.0f;
            }
            TuxTextView tvAiComponentEntrance = getTvAiComponentEntrance();
            if (tvAiComponentEntrance != null) {
                tvAiComponentEntrance.setMaxWidth((int) (fFloatValue - fLIZJ));
            }
        }
        String str9 = "";
        if (efficiencyComponents == null || (list2 = efficiencyComponents.aiComponents) == null || (str = (String) C13LP.LJJJLL(list2)) == null) {
            str = "";
        }
        if (efficiencyComponents != null && (list = efficiencyComponents.aiComponents) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (sparkContext != null && (interfaceC1036110d4L = (InterfaceC1036110d4L) sparkContext.LJFF(InterfaceC1036110d4L.class)) != null) {
            interfaceC1036110d4L.LIZ(size, str);
        }
        if (efficiencyComponents != null) {
            str2 = efficiencyComponents.leftText;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TuxTextView tvAiComponentEntrance2 = getTvAiComponentEntrance();
            if (efficiencyComponents != null) {
                str7 = efficiencyComponents.leftText;
            } else {
                str7 = null;
            }
            tvAiComponentEntrance2.setText(str7);
        }
        RadiusLayout aiComponentEntrance = getAiComponentEntrance();
        if (aiComponentEntrance != null) {
            C786410Ut5.I7(new ACListenerS32S0100100_16(500L, new AwS113S0400000_16(efficiencyComponents, c1035880d3y, this, sparkContext, 2), 3), aiComponentEntrance);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1c, getContext());
        if (efficiencyComponents != null) {
            str3 = efficiencyComponents.color;
            Integer num = efficiencyComponents.radius;
            if (num != null) {
                fIntValue = num.intValue();
            }
        } else {
            str3 = null;
        }
        RadiusLayout aiComponentEntrance2 = getAiComponentEntrance();
        if (str3 != null) {
            try {
                if (str3.length() > 0) {
                    C01GW c01gw = C2248361CzK.LIZ;
                    Integer numLJ = C2248361CzK.LJ(getContext(), str3);
                    if (numLJ != null) {
                        numLIZJ2 = numLJ;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = numLIZJ2;
        c384050F3z.LIZJ = Float.valueOf(C12ES.LIZJ(fIntValue, aiComponentEntrance2.getContext()));
        aiComponentEntrance2.setBackground(c384050F3z.LIZ(getContext()));
        if (efficiencyComponents != null) {
            str4 = efficiencyComponents.leftIcon;
        } else {
            str4 = null;
        }
        TuxIconView ivAiComponentButtonIcon = getIvAiComponentButtonIcon();
        if (TextUtils.isEmpty(str4)) {
            C786410Ut5.LLLLLLZZ(ivAiComponentButtonIcon, 8);
        } else {
            C786410Ut5.LLLLLLZZ(ivAiComponentButtonIcon, 0);
            if (str4 != null) {
                try {
                    C01GW c01gw2 = C2248361CzK.LIZ;
                    C698190Ra5 c698190Ra5LJFF2 = C2248361CzK.LJFF(getContext(), str4);
                    if (c698190Ra5LJFF2 != null) {
                        ivAiComponentButtonIcon.setIconRes(c698190Ra5LJFF2.LIZ);
                        Integer num2 = c698190Ra5LJFF2.LIZIZ;
                        if (num2 != null) {
                            ivAiComponentButtonIcon.setTintColor(num2.intValue());
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        if (efficiencyComponents != null) {
            str5 = efficiencyComponents.leftHighLightIcon;
        } else {
            str5 = null;
        }
        Context context = getContext();
        if (str5 != null) {
            try {
                c698190Ra5LJFF = C2248361CzK.LJFF(context, str5);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (c698190Ra5LJFF != null) {
            i = c698190Ra5LJFF.LIZ;
        } else {
            i = R.raw.icon_ai_insight_fill;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        if (c698190Ra5LJFF == null || (numLIZJ = c698190Ra5LJFF.LIZIZ) == null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.ce, getContext());
        }
        c419910GdJ.LIZLLL = numLIZJ;
        c419910GdJ.LJFF = false;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        C418860Gbc ivAiComponentButtonIconHighLight = getIvAiComponentButtonIconHighLight();
        if (ivAiComponentButtonIconHighLight != null) {
            ivAiComponentButtonIconHighLight.setScale(1.0f);
        }
        C418860Gbc ivAiComponentButtonIconHighLight2 = getIvAiComponentButtonIconHighLight();
        if (ivAiComponentButtonIconHighLight2 != null) {
            ivAiComponentButtonIconHighLight2.setIconDrawable(tuxIconDrawableLIZ);
        }
        TuxTextView tvAiComponentEntrance3 = getTvAiComponentEntrance();
        if (tvAiComponentEntrance3 != null) {
            if (efficiencyComponents != null && (str6 = efficiencyComponents.leftText) != null) {
                str9 = str6;
            }
            tvAiComponentEntrance3.setText(str9);
        }
    }
}
