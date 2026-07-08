package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlotKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.LaunchMediaSelectionNodeKt$launchMediaSelectionNode$1", f = "LaunchMediaSelectionNode.kt", l = {}, m = "invokeSuspend")
public final class C526660Kl6 extends C09AX implements Function2<C526670Kl7, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public /* synthetic */ Object LL;

    public C526660Kl6(InterfaceC1364105Vn<? super C526660Kl6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C526660Kl6 c526660Kl6 = new C526660Kl6(interfaceC1364105Vn);
        c526660Kl6.LL = obj;
        return c526660Kl6;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C526670Kl7 c526670Kl7, InterfaceC1364105Vn<? super C189200o6<Unit>> interfaceC1364105Vn) {
        return ((a) create(c526670Kl7, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(C526670Kl7 c526670Kl7, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return invoke2(c526670Kl7, (InterfaceC1364105Vn<? super C189200o6<Unit>>) interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("LaunchMediaSelectionNodeKt@22f8.launchMediaSelectionNode$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C526670Kl7 c526670Kl7 = (C526670Kl7) this.LL;
        TemplateConsumeCoreParam templateConsumeCoreParam = c526670Kl7.LIZ;
        Activity activity = c526670Kl7.LIZIZ;
        ShortVideoContext shortVideoContext = c526670Kl7.LIZJ;
        if (activity.isFinishing()) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LaunchMediaSelectionNode abort: activity finishing, id=");
            sbLIZ.append(templateConsumeCoreParam.templateId);
            C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
            C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(C0FQL.LIZIZ("activity_finishing"));
            C1C7U.LIZIZ("LaunchMediaSelectionNodeKt@22f8.launchMediaSelectionNode$1");
            return c189200o6M1boximpl;
        }
        ITemplateAlbumService iTemplateAlbumService = C523300Kfg.LIZ;
        if (iTemplateAlbumService == null) {
            C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LaunchMediaSelectionNode abort: album service null, id=");
            sbLIZ2.append(templateConsumeCoreParam.templateId);
            C201955140j.LJII(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
            C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(C0FQL.LIZIZ("album_service_null"));
            C1C7U.LIZIZ("LaunchMediaSelectionNodeKt@22f8.launchMediaSelectionNode$1");
            return c189200o6M1boximpl2;
        }
        iTemplateAlbumService.LJII(templateConsumeCoreParam.templateId);
        Bundle bundle = new Bundle();
        if (shortVideoContext != null) {
            C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        }
        bundle.putInt("key_choose_scene", 5);
        C786410Ut5.LJJIJL(bundle, "template_consume_core_param", templateConsumeCoreParam);
        C532290KuB c532290KuB = C526680Kl8.LIZ;
        List<TemplateSlot> listLJIIIZ = iTemplateAlbumService.LJIIIZ(templateConsumeCoreParam.templateId, templateConsumeCoreParam.templateType);
        if (listLJIIIZ != null && !listLJIIIZ.isEmpty()) {
            int size = listLJIIIZ.size();
            int iLJIIJ = iTemplateAlbumService.LJIIJ(templateConsumeCoreParam.templateId, templateConsumeCoreParam.templateType);
            int iLJI = iTemplateAlbumService.LJI(templateConsumeCoreParam.templateId, templateConsumeCoreParam.templateType);
            int iLIZIZ = iTemplateAlbumService.LIZIZ(templateConsumeCoreParam.templateId, templateConsumeCoreParam.templateType);
            bundle.putInt("key_photo_select_min_count", iLJIIJ);
            bundle.putInt("key_photo_select_max_count", size);
            bundle.putInt("key_video_select_min_count", iLJIIJ);
            bundle.putInt("key_video_select_max_count", size);
            bundle.putInt("key_support_flag", 6);
            bundle.putBoolean("Key_enable_multi_video", true);
            if (iLIZIZ == size) {
                bundle.putInt("key_default_landing_tab", EnumC538250L9b.VIDEO.getType());
            } else if (iLJI == size) {
                bundle.putInt("key_default_landing_tab", EnumC538250L9b.PHOTO.getType());
            }
            if (!listLJIIIZ.isEmpty()) {
                Iterator<TemplateSlot> it2 = listLJIIIZ.iterator();
                while (it2.hasNext()) {
                    if (TemplateSlotKt.getHasMaterialTypeConstraints(it2.next())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            C786410Ut5.LJJJI("key_mv_hint_text", iTemplateAlbumService.LJIIIIZZ(activity, 5, shortVideoContext, size, z, iLJI, iLIZIZ), bundle);
            C1660680tJi.LIZ().LIZJ(activity, bundle, 1, 1);
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            C189200o6 c189200o6M1boximpl3 = C189200o6.m1boximpl(unit);
            C1C7U.LIZIZ("LaunchMediaSelectionNodeKt@22f8.launchMediaSelectionNode$1");
            return c189200o6M1boximpl3;
        }
        C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LaunchMediaSelectionNode abort: empty media slots, id=");
        sbLIZ3.append(templateConsumeCoreParam.templateId);
        C201955140j.LJII(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ3));
        C189200o6 c189200o6M1boximpl4 = C189200o6.m1boximpl(C0FQL.LIZIZ("empty_media_slots"));
        C1C7U.LIZIZ("LaunchMediaSelectionNodeKt@22f8.launchMediaSelectionNode$1");
        return c189200o6M1boximpl4;
    }
}
