package X;

import android.app.Activity;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.texttoimage.TextImageAIGCInterceptor;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0M58, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextImageAIGCInterceptor$getTextImageRouteContext$1", f = "TextImageAIGCInterceptor.kt", l = {86}, m = "invokeSuspend")
public final class C0M58 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0M5A>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<C0LSZ> LLILLL;
    public final /* synthetic */ TextImageAIGCInterceptor LLILZ;
    public final /* synthetic */ RouteIntent LLILZIL;
    public final /* synthetic */ Activity LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M58(C259800zU<C0LSZ> c259800zU, TextImageAIGCInterceptor textImageAIGCInterceptor, RouteIntent routeIntent, Activity activity, InterfaceC1364105Vn<? super C0M58> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = textImageAIGCInterceptor;
        this.LLILZIL = routeIntent;
        this.LLILZLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M58(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<C0LSZ> c259800zU;
        T t;
        String string;
        EnumC696090RSd enumC696090RSdLJFF;
        IAVPublishService iAVPublishServicePublishService;
        List<PublishModel> allPublishModel;
        String str;
        InterfaceC1593650rZb interfaceC1593650rZbLJJIFFI;
        Object obj2 = obj;
        C1C7U.LIZ("TextImageAIGCInterceptor@3fae.getTextImageRouteContext$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj2);
                t = obj2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj2);
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            c259800zU = this.LLILLL;
            if (iCreationAsyncTaskManagerLIZ != null) {
                String strLIZ = this.LLILZ.LIZ(this.LLILZIL);
                this.LL = c259800zU;
                this.LLILLJJLI = 1;
                Object objLIZJ = iCreationAsyncTaskManagerLIZ.LIZJ(strLIZ, this);
                t = objLIZJ;
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("TextImageAIGCInterceptor@3fae.getTextImageRouteContext$1");
                    return objLJFF;
                }
            } else {
                t = 0;
            }
        }
        c259800zU.element = t;
        if (this.LLILLL.element == null) {
            TextImageAIGCInterceptor textImageAIGCInterceptor = this.LLILZ;
            RouteIntent routeIntent = this.LLILZIL;
            C201955140j.LJII(C0LCM.LIZIZ, "taskId:" + textImageAIGCInterceptor.LIZ(routeIntent) + " not exists");
        }
        TextImageAIGCInterceptor textImageAIGCInterceptor2 = this.LLILZ;
        C0LSZ c0lsz = this.LLILLL.element;
        RouteIntent routeIntent2 = this.LLILZIL;
        textImageAIGCInterceptor2.getClass();
        C0M5A c0m5a = new C0M5A(0);
        String strLIZ2 = textImageAIGCInterceptor2.LIZ(routeIntent2);
        C562670M4z.LIZ.getClass();
        if (strLIZ2.length() != 0) {
            Iterator<Map.Entry<String, ?>> it2 = C562670M4z.LIZIZ.getAll().entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, ?> next = it2.next();
                if (Intrinsics.LJFF(next.getValue(), strLIZ2)) {
                    string = C562670M4z.LIZLLL.getString(next.getKey(), null);
                    if (string == null || string.length() == 0) {
                        break;
                    }
                }
            }
            string = null;
        } else {
            string = null;
        }
        if (string != null) {
            C0M5B c0m5b = C0M5B.DETAIL_PAGE;
            C562670M4z.LIZ.getClass();
            c0m5a = C0M5A.LIZ(c0m5a, c0m5b, false, null, string, Intrinsics.LJFF(C562670M4z.LJ.getString(string, "1"), CardStruct.IStatusCode.DEFAULT), 6);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jump to video detail, result=");
            sbLIZ.append(c0m5a.LIZ);
            sbLIZ.append(", serverTaskId -> awemeId=");
            sbLIZ.append(string);
            sbLIZ.append(", isNormalPublish = ");
            sbLIZ.append(c0m5a.LJ);
            C201955140j.LIZIZ("TextImageAIGCInterceptor", C2188811AlT.LIZIZ(sbLIZ));
        } else if (c0lsz == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("taskInfo null, result=");
            sbLIZ2.append(c0m5a.LIZ);
            C201955140j.LIZIZ("TextImageAIGCInterceptor", C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(c0lsz.LJIIJ, 0, null, 6, null), false, false, true, 2));
            if (awemeDraftLJI != null) {
                Pair pair = new Pair(awemeDraftLJI, Boolean.FALSE);
                AwemeDraft awemeDraft = (AwemeDraft) pair.getFirst();
                boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
                IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
                if (iStoryService != null && (interfaceC1593650rZbLJJIFFI = iStoryService.LJJIFFI()) != null) {
                    enumC696090RSdLJFF = interfaceC1593650rZbLJJIFFI.LJFF(awemeDraft.LIZ());
                } else {
                    enumC696090RSdLJFF = null;
                }
                if (enumC696090RSdLJFF == EnumC696090RSd.UPLOADING) {
                    c0m5a = C0M5A.LIZ(c0m5a, C0M5B.STORY_IMMERSIVE_PAGE, false, awemeDraft, null, false, 26);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("jump to story collect page, result=");
                    sbLIZ3.append(c0m5a.LIZ);
                    C201955140j.LIZIZ("TextImageAIGCInterceptor", C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                    if (iExternalService != null && (iAVPublishServicePublishService = iExternalService.publishService()) != null && (allPublishModel = iAVPublishServicePublishService.getAllPublishModel()) != null) {
                        Iterator<PublishModel> it3 = allPublishModel.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            PublishModel next2 = it3.next();
                            PublishModel publishModel = next2;
                            if (publishModel != null) {
                                str = publishModel.creationId;
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str, awemeDraft.LIZ())) {
                                if (next2 != null) {
                                    c0m5a = C0M5A.LIZ(c0m5a, C0M5B.PROFILE_PAGE, false, awemeDraft, null, false, 26);
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("jump to friends page, result=");
                                    sbLIZ4.append(c0m5a.LIZ);
                                    C201955140j.LIZIZ("TextImageAIGCInterceptor", C2188811AlT.LIZIZ(sbLIZ4));
                                }
                            }
                        }
                        c0m5a = C0M5A.LIZ(c0m5a, C0M5B.CREATION_EDIT_PAGE, zBooleanValue, awemeDraft, null, false, 24);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("result=");
                        sbLIZ5.append(c0m5a.LIZ);
                        C201955140j.LIZIZ("TextImageAIGCInterceptor", C2188811AlT.LIZIZ(sbLIZ5));
                    } else {
                        c0m5a = C0M5A.LIZ(c0m5a, C0M5B.CREATION_EDIT_PAGE, zBooleanValue, awemeDraft, null, false, 24);
                        StringBuilder sbLIZ52 = C2188811AlT.LIZ();
                        sbLIZ52.append("result=");
                        sbLIZ52.append(c0m5a.LIZ);
                        C201955140j.LIZIZ("TextImageAIGCInterceptor", C2188811AlT.LIZIZ(sbLIZ52));
                    }
                }
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("draft null, result=");
                sbLIZ6.append(c0m5a.LIZ);
                C201955140j.LIZIZ("TextImageAIGCInterceptor", C2188811AlT.LIZIZ(sbLIZ6));
            }
        }
        C1C7U.LIZIZ("TextImageAIGCInterceptor@3fae.getTextImageRouteContext$1");
        return c0m5a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0M5A> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
