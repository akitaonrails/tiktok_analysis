package X;

import android.content.Context;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532310KuD {
    public static final C532310KuD LIZ = new C532310KuD();
    public static final ConcurrentHashMap<String, AnonymousClass0957<NLETemplateModel>> LIZIZ = new ConcurrentHashMap<>();
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, boolean r19, X.InterfaceC1364105Vn r20) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532310KuD.LIZIZ(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    public static Object LIZ(Context context, final String str, C531550Ksz c531550Ksz, String str2, String str3, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        int i;
        boolean zBooleanValue;
        ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) PluggableExtentionKt.pluggableSpi$default(ITemplateResourceService.class, false, false, false, 14, null);
        if (iTemplateResourceService == null) {
            return null;
        }
        int i2 = C524660Khs.LIZ[c531550Ksz.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                i = 1;
            } else {
                i = 5;
            }
        } else {
            i = -1;
        }
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        Context contextN3 = C786410Ut5.N3(context);
        C532330KuF c532330KuF = c531550Ksz.LIZJ;
        String str4 = c532330KuF.LIZ;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = c532330KuF.LIZIZ;
        EnumC539100LCi enumC539100LCiLIZ = C0LBC.LIZ(i);
        BinderC532620Kui binderC532620Kui = new BinderC532620Kui("NLETemplateModelLoader", str, i);
        int value = c531550Ksz.LIZ.getValue();
        String str6 = c531550Ksz.LIZIZ.LIZ;
        Boolean boolValueOf = Boolean.valueOf(z);
        binderC532620Kui.LLILZLL = C1412660mrg.LIZJ(value);
        binderC532620Kui.LLIZ = str6;
        binderC532620Kui.LLIZLLLIL = str2;
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        binderC532620Kui.LLJI = zBooleanValue;
        binderC532620Kui.LLJ = str3;
        binderC532620Kui.LLJIJIL = true;
        iTemplateResourceService.LJIIIZ(contextN3, str4, new C1428840nHm(str5, (Boolean) null, false, (NLEModelDownloader) null, enumC539100LCiLIZ, (ICutReporter) binderC532620Kui, false, false, new NLEPrepareListener() { // from class: X.09pL
            public boolean LIZ;
            public final /* synthetic */ Function1<NLETemplateModel, Unit> LIZIZ = null;
            public final /* synthetic */ Function2<Integer, String, Unit> LJ = null;

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onProgress(float f, String str7) {
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                Function1<NLETemplateModel, Unit> function1 = this.LIZIZ;
                if (function1 != null) {
                    function1.invoke(nLETemplateModel);
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                if (!this.LIZ) {
                    this.LIZ = true;
                    InterfaceC1364105Vn<NLETemplateModel> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(nLETemplateModel);
                    interfaceC1364105Vn2.resumeWith(nLETemplateModel);
                }
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onError(int i3, String str7) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NLETemplateModelLoader onError: id=");
                sbLIZ.append(str);
                sbLIZ.append(", code=");
                sbLIZ.append(i3);
                sbLIZ.append(", msg=");
                sbLIZ.append(str7);
                C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                Function2<Integer, String, Unit> function2 = this.LJ;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i3), str7);
                }
                if (!this.LIZ) {
                    this.LIZ = true;
                    InterfaceC1364105Vn<NLETemplateModel> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn2.resumeWith(null);
                }
            }
        }, 410), null, -1);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
