package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.airemix.api.service.ICreativeMarkdownService;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18u9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21432318u9 {
    public static boolean LIZIZ;
    public static final C21432318u9 LIZ = new C21432318u9();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(275));

    public static void LIZIZ(Context context) {
        ICreativeMarkdownService iCreativeMarkdownService;
        if (!LIZIZ) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C14TF.LIZIZ.LJLZ());
            IMAIServiceAPI.LIZ.getClass();
            AnonymousClass0629.LIZ().LIZ().LIZJ();
            ICreativeMarkdownService.LIZ.getClass();
            CreativeToolsBizPluginService.LIZ.getClass();
            CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
            if ((creativeToolsBizPluginServiceLIZ != null && !creativeToolsBizPluginServiceLIZ.LIZ()) || (iCreativeMarkdownService = (ICreativeMarkdownService) C0WYG.LIZ(ICreativeMarkdownService.class, "com.ss.android.ugc.airemix.impl.chatpage.messages.cell.answer.markdown.CreativeMarkdownService")) == null) {
                iCreativeMarkdownService = new ICreativeMarkdownService() { // from class: X.18uq
                    @Override // com.ss.android.ugc.airemix.api.service.ICreativeMarkdownService
                    public final C21419418s4 LIZ(Context context2) {
                        return null;
                    }

                    @Override // com.ss.android.ugc.airemix.api.service.ICreativeMarkdownService
                    public final InterfaceC1859860yUy LIZJ() {
                        return null;
                    }

                    @Override // com.ss.android.ugc.airemix.api.service.ICreativeMarkdownService
                    public final void LIZLLL(Context context2, TextView textView) {
                    }

                    @Override // com.ss.android.ugc.airemix.api.service.ICreativeMarkdownService
                    public final void LJ(TextView textView, String str, C21419418s4 c21419418s4, InterfaceC328600CuQ interfaceC328600CuQ, C0R20 c0r20) {
                    }
                };
            }
            InterfaceC1859860yUy interfaceC1859860yUyLIZJ = iCreativeMarkdownService.LIZJ();
            if (interfaceC1859860yUyLIZJ != null) {
                arrayList.add(interfaceC1859860yUyLIZJ);
            }
            C309110C9t c309110C9t = new C309110C9t(arrayList);
            InterfaceC328690CuZ.LIZ.getClass();
            InterfaceC328690CuZ interfaceC328690CuZLIZ = C330610Cxf.LIZ();
            if (interfaceC328690CuZLIZ != null) {
                interfaceC328690CuZLIZ.LJ(C1BWL.LIZ(), c309110C9t);
            }
            InterfaceC328690CuZ interfaceC328690CuZLIZ2 = C330610Cxf.LIZ();
            if (interfaceC328690CuZLIZ2 != null) {
                interfaceC328690CuZLIZ2.LIZ(context);
            }
            InterfaceC328690CuZ interfaceC328690CuZLIZ3 = C330610Cxf.LIZ();
            if (interfaceC328690CuZLIZ3 != null) {
                interfaceC328690CuZLIZ3.LIZJ(C497820Jfg.LIZIZ(context) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2));
            }
        }
        if (C07Q4.LIZ()) {
            InterfaceC328690CuZ.LIZ.getClass();
            InterfaceC328690CuZ interfaceC328690CuZLIZ4 = C330610Cxf.LIZ();
            if (interfaceC328690CuZLIZ4 != null) {
                interfaceC328690CuZLIZ4.LIZLLL(C0R4Q.get$arr$(2));
            }
        } else {
            InterfaceC328690CuZ.LIZ.getClass();
            InterfaceC328690CuZ interfaceC328690CuZLIZ5 = C330610Cxf.LIZ();
            if (interfaceC328690CuZLIZ5 != null) {
                interfaceC328690CuZLIZ5.LIZLLL(C0R4Q.get$arr$(3));
            }
        }
        LIZIZ = true;
    }

    public static InterfaceC418280Gag LIZ(CharSequence charSequence, Map map) {
        Activity activityLIZIZ;
        Object obj;
        int iIntValue;
        AbstractC21446218wO abstractC21446218wOLIZ;
        InterfaceC418280Gag interfaceC418280Gag;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            Object obj2 = null;
            if (map != null) {
                obj = map.get("is_page");
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                obj2 = obj;
            }
            final boolean zLJFF = Intrinsics.LJFF(obj2, Boolean.TRUE);
            final boolean zLIZIZ = C960203pA.LIZIZ(activityLIZIZ);
            Object obj3 = new Object(zLJFF, zLIZIZ) { // from class: X.18v2
                public final boolean LIZ;
                public final boolean LIZIZ;

                public final boolean equals(Object obj4) {
                    if (this == obj4) {
                        return true;
                    }
                    if (!(obj4 instanceof C21437818v2)) {
                        return false;
                    }
                    C21437818v2 c21437818v2 = (C21437818v2) obj4;
                    return this.LIZ == c21437818v2.LIZ && this.LIZIZ == c21437818v2.LIZIZ;
                }

                public final int hashCode() {
                    return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
                }

                {
                    this.LIZ = zLJFF;
                    this.LIZIZ = zLIZIZ;
                }
            };
            C01GW c01gw = LIZJ;
            SoftReference softReference = (SoftReference) ((Map) c01gw.getValue()).get(obj3);
            if (softReference == null || (abstractC21446218wOLIZ = (AbstractC21446218wO) softReference.get()) == null) {
                C844470XAv.LIZ.getClass();
                C21432218u8 c21432218u8 = new C21432218u8(C844470XAv.LIZ());
                c21432218u8.LIZIZ(new C21423818sm());
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                C21422218sW c21422218sW = new C21422218sW(null, false, false, null, false, false, false);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, activityLIZIZ);
                if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, activityLIZIZ);
                if (numLIZJ2 != null) {
                    iIntValue3 = numLIZJ2.intValue();
                }
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a01, activityLIZIZ);
                if (numLIZJ3 != null) {
                    iIntValue = numLIZJ3.intValue();
                } else {
                    iIntValue = 0;
                }
                TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(activityLIZIZ, R.raw.icon_link);
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1k, activityLIZIZ);
                if (numLIZJ4 != null) {
                    tuxIconDrawable.LJFF(numLIZJ4.intValue());
                }
                C11G1 c11g1 = new C11G1(tuxIconDrawable, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                C689240R1u.LIZ.getClass();
                final C21434918uZ c21434918uZ = new C21434918uZ(iIntValue2, iIntValue3, iIntValue, c11g1, ((Number) C689240R1u.LJIJ.invoke(activityLIZIZ)).intValue(), ((Number) C689240R1u.LJIJJ.invoke(activityLIZIZ)).intValue(), C689240R1u.LJI(), new C21437918v3((Bitmap) C689240R1u.LJI.invoke(activityLIZIZ)), C418440Gaw.LIZIZ(8), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
                c21422218sW.LJIIL(new AbstractC21434518uV(c21434918uZ, zLJFF) { // from class: X.18uR
                    public static final /* synthetic */ int LIZJ = 0;
                    public final C21434918uZ LIZ;
                    public final boolean LIZIZ;

                    @Override // X.AbstractC21434218uS
                    public final Collection<String> LIZJ() {
                        return C1697810uHb.LJIILJJIL("sup");
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    public final boolean equals(Object obj4) {
                        if (this == obj4) {
                            return true;
                        }
                        if ((obj4 instanceof C21434118uR) && Intrinsics.LJFF(this.LIZ, ((C21434118uR) obj4).LIZ)) {
                            return true;
                        }
                        return false;
                    }

                    {
                        this.LIZ = c21434918uZ;
                        this.LIZIZ = zLJFF;
                    }

                    public final String LJFF(String str, Map map2) {
                        if (this.LIZIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            String str2 = (String) map2.get("landing_page_prefix");
                            if (str2 == null) {
                                str2 = "";
                            }
                            sbLIZ.append(str2);
                            sbLIZ.append(str);
                            return (String) map2.get(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return (String) map2.get(str);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
                    @Override // X.AbstractC21434518uV
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LJ(X.C21432118u7 r15, X.C14S7 r16, X.InterfaceC21435018ua r17) {
                        /*
                            Method dump skipped, instruction units count: 236
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21434118uR.LJ(X.18u7, X.14S7, X.18ua):java.lang.Object");
                    }
                });
                c21432218u8.LIZIZ(c21422218sW);
                abstractC21446218wOLIZ = c21432218u8.LIZ();
                LIZ.getClass();
                ((Map) c01gw.getValue()).put(obj3, new SoftReference(abstractC21446218wOLIZ));
            }
            Object[] spans = abstractC21446218wOLIZ.LIZ(charSequence.toString()).getSpans(0, charSequence.length(), InterfaceC418280Gag.class);
            if (spans == null || (interfaceC418280Gag = (InterfaceC418280Gag) C13LQ.LJJIIZ(0, spans)) == null) {
                return new C418400Gas();
            }
            return interfaceC418280Gag;
        }
        return new C418400Gas();
    }
}
