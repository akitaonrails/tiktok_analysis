package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.NoticeNudgeBtnProxy$triggerLightInteraction$1", f = "NoticeNudgeBtnProxy.kt", l = {275}, m = "invokeSuspend")
public final class C896090ZDj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0ZDA LLILLJJLI;
    public final /* synthetic */ C896130ZDn LLILLL;
    public final /* synthetic */ C896120ZDm LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C896090ZDj(C0ZDA c0zda, C896130ZDn c896130ZDn, C896120ZDm c896120ZDm, String str, InterfaceC1364105Vn<? super C896090ZDj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0zda;
        this.LLILLL = c896130ZDn;
        this.LLILZ = c896120ZDm;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C896090ZDj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaseContent.ReferenceVideo referenceVideo;
        String refVideoId;
        String strLJJIIJZLJL;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        C1C7U.LIZ("NoticeNudgeBtnProxy@b764.triggerLightInteraction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", this.LLILLJJLI.LIZ), new Pair("enter_method", this.LLILLJJLI.LIZIZ), new Pair("position", "new_activities"));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("nudgeInfoWrapper: ");
            sbLIZ.append(this.LLILLL);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILZ.getClass();
            ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ = C896120ZDm.LJIIIZ();
            if (iLightInteractionPlatformServiceLJIIIZ != null) {
                String uid = this.LLILLL.LIZLLL.getUid();
                C0ZD9 c0zd9 = this.LLILLL.LJ;
                AttachmentComponent attachmentComponent = c0zd9.LJI;
                Serializable serializable = c0zd9.LJ;
                ReferenceInfo referenceInfo = c0zd9.LJII;
                int iOrdinal = c0zd9.LIZLLL.ordinal();
                final C896120ZDm c896120ZDm = this.LLILZ;
                final String str = this.LLILZIL;
                final C896130ZDn c896130ZDn = this.LLILLL;
                C0YTK c0ytk = new C0YTK() { // from class: X.0ZDk
                    @Override // X.C0YTY
                    public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
                    }

                    @Override // X.C0YTK
                    public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    }

                    @Override // X.C0YTK
                    public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    }

                    @Override // X.C0YTY
                    public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    }

                    @Override // X.C0YTK
                    public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                    }

                    @Override // X.C0YTK
                    public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map) {
                        c896120ZDm.getClass();
                        ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ2 = C896120ZDm.LJIIIZ();
                        if (iLightInteractionPlatformServiceLJIIIZ2 != null) {
                            String str2 = str;
                            C896130ZDn c896130ZDn2 = c896130ZDn;
                            iLightInteractionPlatformServiceLJIIIZ2.LJJJJLL(str2, c896130ZDn2.LJ.LJFF, c896130ZDn2.LIZ, false, c896130ZDn2.LIZLLL.getNickname(), mapLJIIIIZZ, null);
                        }
                    }
                };
                Integer numLJ = C2286608xc.LJ(iOrdinal);
                this.LL = 1;
                if (iLightInteractionPlatformServiceLJIIIZ.LJJLI(str, null, uid, mapLJIIIIZZ, referenceInfo, attachmentComponent, serializable, numLJ, c0ytk, this) == objLJFF) {
                    C1C7U.LIZIZ("NoticeNudgeBtnProxy@b764.triggerLightInteraction$1");
                    return objLJFF;
                }
            }
        }
        if (Intrinsics.LJFF(this.LLILZIL, "heart_favourite_v1") || Intrinsics.LJFF(this.LLILZIL, "heart_like_v1")) {
            Serializable serializable2 = this.LLILLL.LJ.LJ;
            if ((serializable2 instanceof BaseContent.ReferenceVideo) && (referenceVideo = (BaseContent.ReferenceVideo) serializable2) != null && (refVideoId = referenceVideo.getRefVideoId()) != null) {
                C896120ZDm c896120ZDm2 = this.LLILZ;
                C896130ZDn c896130ZDn2 = this.LLILLL;
                c896120ZDm2.getClass();
                ILightInteractionPlatformService iLightInteractionPlatformServiceLJIIIZ2 = C896120ZDm.LJIIIZ();
                if (iLightInteractionPlatformServiceLJIIIZ2 == null || (strLJJIIJZLJL = iLightInteractionPlatformServiceLJIIIZ2.LJJIIJZLJL(refVideoId, c896130ZDn2.LIZLLL.getUid())) == null) {
                    strLJJIIJZLJL = "";
                }
                InterfaceC1411705fn interfaceC1411705fn = (InterfaceC1411705fn) c896120ZDm2.LJFF.getValue();
                if (interfaceC1411705fn != null) {
                    IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                    if (iMHostApi != null) {
                        jCurrentTimeMillis = iMHostApi.LIZIZ();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                    if (iMHostApi2 != null) {
                        jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                    }
                    interfaceC1411705fn.LIZLLL(jCurrentTimeMillis, jCurrentTimeMillis2, strLJJIIJZLJL);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoticeNudgeBtnProxy@b764.triggerLightInteraction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
