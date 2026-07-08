package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755980vnQ extends FrameLayout {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public String LLILLJJLI;
    public String LLILLL;
    public LynxViewClient LLILZ;
    public AbstractC1542200qEc LLILZIL;

    public C1755980vnQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C1537710q7N c1537710q7N;
        C1537480q70 hybridContext;
        InterfaceC1531560pxS interfaceC1531560pxS;
        Map<String, Object> mapLJFF;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
        Object obj = null;
        InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView() : null;
        if ((kitView instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) kitView) != null && (hybridContext = c1537710q7N.getHybridContext()) != null && (interfaceC1531560pxS = hybridContext.hybridParams) != null && (mapLJFF = interfaceC1531560pxS.LJFF()) != null) {
            obj = mapLJFF.get("usePreload");
        }
        if (Intrinsics.LJFF(obj, "1") || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL) == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
    }

    public final void LIZJ(String str) {
        TemplateData templateDataLJIIIIZZ;
        LynxView lynxView;
        InterfaceC1541990qEH kitView;
        View viewE1 = null;
        if (str == null) {
            templateDataLJIIIIZZ = null;
        } else {
            templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            viewE1 = kitView.e1();
        }
        if ((viewE1 instanceof LynxView) && (lynxView = (LynxView) viewE1) != null) {
            lynxView.updateData(templateDataLJIIIIZZ);
        }
    }

    public final void setLynxCallback(LynxViewClient lynxViewClient) {
        this.LLILZ = lynxViewClient;
    }

    public final void setSparkLoadCallback(AbstractC1542200qEc abstractC1542200qEc) {
        this.LLILZIL = abstractC1542200qEc;
    }

    public C1755980vnQ(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILLL = "";
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ(C1755990vnR c1755990vnR, String str, InterfaceC1748810vbr interfaceC1748810vbr) {
        TemplateData templateDataLJIIIIZZ;
        InterfaceC1541990qEH kitView;
        C1537910q7h c1537910q7h;
        C1537710q7N c1537710q7N;
        C1537480q70 hybridContext;
        this.LLILLJJLI = c1755990vnR.LL;
        this.LLILLL = str;
        if (this.LL == null) {
            Context context = getContext();
            String str2 = c1755990vnR.LLILLJJLI;
            C1548750qPB c1548750qPB = C1548750qPB.LIZ;
            String str3 = this.LLILLL;
            String str4 = this.LLILLJJLI;
            InterfaceC1531560pxS interfaceC1531560pxS = null;
            if (str4 == null) {
                templateDataLJIIIIZZ = null;
            } else {
                templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str4);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C1548750qPB.LIZ(c1548750qPB, context, str3, str2, templateDataLJIIIIZZ, null, null, null, null, 240);
            this.LL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext();
            if (sparkContext != null) {
                AbstractC1542200qEc abstractC1542200qEc = this.LLILZIL;
                if (abstractC1542200qEc != null) {
                    sparkContext.LJJJJZI(abstractC1542200qEc);
                }
                C1075770e6J c1075770e6J = (C1075770e6J) sparkContext.LJFF(C1075770e6J.class);
                if (c1075770e6J != null && interfaceC1748810vbr != null) {
                    c1075770e6J.LJIJJ(InterfaceC1748810vbr.class, interfaceC1748810vbr);
                }
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            } else {
                kitView = null;
            }
            if ((kitView instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) kitView) != null && (hybridContext = c1537710q7N.getHybridContext()) != null) {
                interfaceC1531560pxS = hybridContext.hybridParams;
            }
            if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                c1537910q7h.LJJI = true;
                LynxViewClient lynxViewClient = this.LLILZ;
                if (lynxViewClient != null) {
                    c1537910q7h.LJIIIIZZ(lynxViewClient);
                }
            }
        }
        if (getChildCount() == 0) {
            addView(this.LL, new FrameLayout.LayoutParams(-1, -1));
        }
        return this.LL;
    }
}
