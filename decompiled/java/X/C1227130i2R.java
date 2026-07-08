package X;

import android.content.Context;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS4S3200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227130i2R {
    public static final C1227130i2R LIZ = new C1227130i2R();

    public static BaseFragment LIZIZ(AbstractC1225780i0G abstractC1225780i0G) {
        IContactSelectorAPI iContactSelectorAPI;
        AbstractC1225770i0F abstractC1225770i0FLIZJ = LIZJ(abstractC1225780i0G);
        if (abstractC1225770i0FLIZJ != null && (iContactSelectorAPI = (IContactSelectorAPI) PluggableExtentionKt.pluggableSpiForReal(IContactSelectorAPI.class)) != null) {
            return iContactSelectorAPI.LIZJ(abstractC1225770i0FLIZJ);
        }
        return null;
    }

    public static AbstractC1225770i0F LIZJ(AbstractC1225780i0G abstractC1225780i0G) {
        Object next;
        List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, IContactSelectorTemplateFactory.class, false);
        if (listLIZIZ == null) {
            return null;
        }
        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((IContactSelectorTemplateFactory) next).pN(), abstractC1225780i0G.LJIIJ())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        IContactSelectorTemplateFactory iContactSelectorTemplateFactory = (IContactSelectorTemplateFactory) next;
        if (iContactSelectorTemplateFactory == null) {
            return null;
        }
        return iContactSelectorTemplateFactory.gI0(abstractC1225780i0G);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (X.C894660Z7w.LJ() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.content.Context r3, X.AbstractC1225780i0G r4) {
        /*
            boolean r0 = r4 instanceof X.C1226980i2C
            if (r0 == 0) goto L18
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L2a
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 != 0) goto L2a
        L18:
            kotlin.jvm.internal.AwS563S0100000_19 r2 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 3050(0xbea, float:4.274E-42)
            r2.<init>(r4, r0)
            kotlin.jvm.internal.AwS598S0100000_19 r1 = new kotlin.jvm.internal.AwS598S0100000_19
            r0 = 670(0x29e, float:9.39E-43)
            r1.<init>(r3, r0)
            LIZ(r3, r2, r1)
            return
        L2a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "please use IMGroupChatApi.getOpenPlatformService().openNewConversationSelector() to open NewGroup ContactSelector"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1227130i2R.LJ(android.content.Context, X.0i0G):void");
    }

    public static void LIZ(Context context, Function0 function0, Function1 function1) {
        Unit unit;
        Object objInvoke = function0.invoke();
        if (objInvoke != null) {
            function1.invoke(objInvoke);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1618506Vj c1618506Vj = IMGroupChatApi.LIZIZ;
        c1618506Vj.getClass();
        C1618506Vj.LIZLLL(unit, "open_new_conversation_selector");
        if (unit == null) {
            AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2(function0, (Function0<Object>) function1, (Function1<Object, Unit>) 114);
            c1618506Vj.getClass();
            C1618506Vj.LJ(context, awS368S0200000_2);
        }
    }

    public static final void LIZLLL(Context context, C1226980i2C c1226980i2C, String str, String str2, String str3) {
        C1227690i3L.LJIIJ(str, str2, true);
        C1227230i2b.LIZ(str, str2, str3, "create_group_panel");
        LIZ(context, new AwS563S0100000_19(c1226980i2C, 3051), new AwS4S3200000_19(context, c1226980i2C, str, str2, str3, 1));
    }
}
