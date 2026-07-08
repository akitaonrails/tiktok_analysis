package X;

import android.util.LruCache;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.TemplateBundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qs6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683880Qs6 {
    public static void LIZIZ(C1536940q68 c1536940q68) {
        if (c1536940q68.LIZ.length() == 0 || Intrinsics.LJFF(c1536940q68.LIZ, "hybridkit_default_bid") || C1536910q65.LIZLLL().containsKey(c1536940q68.LIZ)) {
            return;
        }
        String str = c1536940q68.LIZ;
        if (str.length() > 0) {
            C1536910q65.LIZLLL().put(str, c1536940q68);
        }
    }

    public static void LIZ(final String str, SparkContext sparkContext, AbstractC1536860q60 abstractC1536860q60, boolean z, final Function1 function1, int i) {
        boolean z2 = z;
        final C1537480q70 c1537480q70 = sparkContext;
        final AbstractC1536860q60 abstractC1536860q602 = null;
        if ((i & 2) != 0) {
            c1537480q70 = null;
        }
        if ((i & 4) == 0) {
            abstractC1536860q602 = abstractC1536860q60;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        String strLIZJ = C1536910q65.LIZJ(str);
        if (c1537480q70 == null) {
            c1537480q70 = new C1537480q70();
        }
        c1537480q70.LJJIIZ(str);
        if (strLIZJ.length() == 0) {
            C1536840q5y.LIZIZ(c1537480q70, abstractC1536860q602, null, z2, Boolean.TRUE, 32);
        } else {
            if (!C1536910q65.LIZLLL().containsKey(strLIZJ)) {
                function1.invoke(EnumC680180Qm8.BizNotRegister);
                return;
            }
            final C1536940q68 c1536940q68 = (C1536940q68) C1536910q65.LIZLLL().get(strLIZJ);
            if (c1536940q68 == null) {
                return;
            }
            final String strLIZ = C01CL.LIZ(str);
            C1536840q5y.LIZIZ(c1537480q70, new AbstractC1536860q60() { // from class: X.0q62
                public C1533790q13 LIZ;
                public C1532310pyf LIZIZ;

                @Override // X.AbstractC1536860q60
                public final void LIZJ(String str2) {
                    AbstractC1536860q60 abstractC1536860q603 = abstractC1536860q602;
                    if (abstractC1536860q603 != null) {
                        abstractC1536860q603.LIZJ(str2);
                    }
                    function1.invoke(EnumC680180Qm8.TemplateCreateError);
                }

                @Override // X.AbstractC1536860q60
                public final void LIZLLL(TemplateBundle templateBundle) {
                    AbstractC1536860q60 abstractC1536860q603 = abstractC1536860q602;
                    if (abstractC1536860q603 != null) {
                        abstractC1536860q603.LIZLLL(templateBundle);
                    }
                    if (templateBundle == null) {
                        function1.invoke(EnumC680180Qm8.TemplateIsNil);
                        return;
                    }
                    if (templateBundle.LLILZ != null) {
                        function1.invoke(EnumC680180Qm8.TemplateCreateError);
                        return;
                    }
                    C1533790q13 c1533790q13 = this.LIZ;
                    if (c1533790q13 != null || this.LIZIZ != null) {
                        c1536940q68.LIZJ.put(strLIZ, new C1536930q67(templateBundle, c1533790q13, this.LIZIZ, null));
                    }
                    LruCache<String, C1536930q67> lruCache = C1536910q65.LIZ;
                    if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C01CL.LIZJ(str), "enable_pre_code_cache"), "1")) {
                        try {
                            C1532310pyf c1532310pyf = this.LIZIZ;
                            if (C1535630q41.LJIL) {
                                if (c1532310pyf != null) {
                                    C1535980q4a c1535980q4a = C1535980q4a.LIZ;
                                    C1532710pzJ c1532710pzJ = c1532310pyf.LIZ;
                                    InterfaceC1532190pyT interfaceC1532190pyT = c1532310pyf.LJII;
                                    c1535980q4a.getClass();
                                    C1535980q4a.LIZLLL("SparkLynxTemplateTool", c1532710pzJ, interfaceC1532190pyT, templateBundle);
                                }
                            } else {
                                C1537890q7f c1537890q7f = C1537890q7f.LIZ;
                                String str2 = str;
                                C1537480q70 c1537480q702 = c1537480q70;
                                c1537890q7f.getClass();
                                templateBundle.LJI(C1537890q7f.LIZIZ(c1537480q702, str2), null);
                            }
                            AbstractC1536860q60 abstractC1536860q604 = abstractC1536860q602;
                            if (abstractC1536860q604 != null) {
                                abstractC1536860q604.LIZIZ();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            AbstractC1536860q60 abstractC1536860q605 = abstractC1536860q602;
                            if (abstractC1536860q605 != null) {
                                abstractC1536860q605.LIZ(String.valueOf(th.getMessage()));
                            }
                        }
                    }
                }

                @Override // X.AbstractC1536860q60
                public final void LJ(String str2) {
                    AbstractC1536860q60 abstractC1536860q603 = abstractC1536860q602;
                    if (abstractC1536860q603 != null) {
                        abstractC1536860q603.LJ(str2);
                    }
                    function1.invoke(EnumC680180Qm8.DownloadTemplateJSError);
                }

                @Override // X.AbstractC1536860q60
                public final void LJI(byte[] bArr, C1533790q13 c1533790q13, C1532310pyf c1532310pyf) {
                    this.LIZ = c1533790q13;
                    this.LIZIZ = c1532310pyf;
                    AbstractC1536860q60 abstractC1536860q603 = abstractC1536860q602;
                    if (abstractC1536860q603 != null) {
                        abstractC1536860q603.LJI(bArr, c1533790q13, c1532310pyf);
                    }
                }
            }, null, z2, Boolean.FALSE, 32);
        }
    }
}
