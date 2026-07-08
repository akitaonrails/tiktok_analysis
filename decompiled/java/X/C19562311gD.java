package X;

import android.content.Context;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11gD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19562311gD extends C09AY implements Function1<Effect, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AbstractC20598115it LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19562311gD(String str, String str2, String str3, String str4, AbstractC20598115it abstractC20598115it, Context context) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = abstractC20598115it;
        this.LLILZLL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Effect effect) {
        if (this.LL.length() == 0) {
            final String str = this.LLILLJJLI;
            final String str2 = this.LLILLL;
            final String str3 = this.LLILZ;
            final AbstractC20598115it abstractC20598115it = this.LLILZIL;
            final Context context = this.LLILZLL;
            ((InterfaceC1635410sex) new C565780MGy().LIZ.getValue()).sg("aiself", "aiselfprofile", 0, 0, 0, null, new IFetchCategoryEffectListener() { // from class: X.11i4
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
                public final void onFail(ExceptionResult exceptionResult) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(CategoryPageModel categoryPageModel) {
                    CategoryEffectModel categoryEffects;
                    List<Effect> category_effects;
                    Effect effect2;
                    CategoryPageModel categoryPageModel2 = categoryPageModel;
                    if (categoryPageModel2 != null && (categoryEffects = categoryPageModel2.getCategoryEffects()) != null && (category_effects = categoryEffects.getCategory_effects()) != null && (effect2 = (Effect) C13LP.LJJJLL(category_effects)) != null) {
                        RecordConfig.Builder builder = new RecordConfig.Builder();
                        builder.shootWay(str);
                        builder.enterMethod(str2);
                        builder.enterFrom(str3);
                        builder.creationId(UUID.randomUUID().toString());
                        builder.startRecordTime(0L);
                        builder.stickers(C1697810uHb.LJ(effect2.getEffectId()));
                        builder.prepareFilter(true);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(Scene.SCENE_SERVICE, C0MJE.START_SCAN_FACE_EXTERNAL.toString());
                        builder.stickerParams(linkedHashMap);
                        builder.startScanFaceForAIProfile(true);
                        builder.hideCameraUIOnStartRecord(true);
                        builder.recordFromFeed(false);
                        abstractC20598115it.startRecord(context, builder.build());
                    }
                }
            });
        } else {
            final String str4 = this.LLILLJJLI;
            final String str5 = this.LLILLL;
            final String str6 = this.LLILZ;
            final AbstractC20598115it abstractC20598115it2 = this.LLILZIL;
            final Context context2 = this.LLILZLL;
            new C565780MGy().LIZ(Collections.singletonList(this.LL), "aiself", new IFetchEffectListListener() { // from class: X.11i3
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult exceptionResult) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> list) {
                    Effect effect2;
                    List<Effect> list2 = list;
                    if (list2 != null && (effect2 = (Effect) C13LP.LJJJLL(list2)) != null) {
                        RecordConfig.Builder builder = new RecordConfig.Builder();
                        builder.shootWay(str4);
                        builder.enterMethod(str5);
                        builder.enterFrom(str6);
                        builder.creationId(UUID.randomUUID().toString());
                        builder.startRecordTime(0L);
                        builder.stickers(C1697810uHb.LJ(effect2.getEffectId()));
                        builder.hideCameraUIOnStartRecord(true);
                        builder.prepareFilter(true);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(Scene.SCENE_SERVICE, C0MJE.START_SCAN_FACE_EXTERNAL.toString());
                        builder.stickerParams(linkedHashMap);
                        builder.recordFromFeed(false);
                        abstractC20598115it2.startRecord(context2, builder.build());
                    }
                }
            }, false);
        }
        return Unit.LIZ;
    }
}
