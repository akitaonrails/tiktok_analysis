package X;

import com.ss.android.ugc.aweme.cla.et.newet.VideoPlayClaRelatedEvent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.016q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2802016q extends C09AY implements Function1<AbstractC207072161e, Unit> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2802016q(boolean z) {
        super(1);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC207072161e abstractC207072161e) {
        int i;
        int i2;
        String str;
        AbstractC207072161e abstractC207072161e2 = abstractC207072161e;
        if (abstractC207072161e2 instanceof VideoPlayClaRelatedEvent) {
            Map<String, String> mapLIZLLL = abstractC207072161e2.LIZLLL();
            int i3 = 1;
            if (!Intrinsics.LJFF(mapLIZLLL.get("is_title_translatable"), "1") && !Intrinsics.LJFF(mapLIZLLL.get("have_transl"), "1") && !Intrinsics.LJFF(mapLIZLLL.get("is_text_sticker_translatable"), "1") && !Intrinsics.LJFF(mapLIZLLL.get("is_photo_title_translatable"), "1") && !Intrinsics.LJFF(mapLIZLLL.get("is_ads_component_translatable"), "1")) {
                i = 0;
            } else {
                i = 1;
            }
            abstractC207072161e2.LJI(Integer.valueOf(i), "is_video_translatable");
            if (!Intrinsics.LJFF(mapLIZLLL.get("is_title_translated"), "1") && !Intrinsics.LJFF(mapLIZLLL.get("use_transl"), "1") && !Intrinsics.LJFF(mapLIZLLL.get("is_text_sticker_translated"), "1") && !Intrinsics.LJFF(mapLIZLLL.get("is_photo_title_translated"), "1") && !Intrinsics.LJFF(mapLIZLLL.get("is_ads_component_translated"), "1")) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            abstractC207072161e2.LJI(Integer.valueOf(i2), "is_video_translated");
            if (!this.LL) {
                C01GW c01gw = C2803016r.LIZ;
                if (((Number) c01gw.getValue()).intValue() != 3 && ((Number) c01gw.getValue()).intValue() != 4) {
                    i3 = 0;
                }
                abstractC207072161e2.LJI(Integer.valueOf(i3), "is_native_layout");
                if (C2803016r.LIZ()) {
                    str = "bottom";
                } else {
                    str = "left";
                }
                abstractC207072161e2.LJI(str, "subtitle_alignment");
            }
        }
        return Unit.LIZ;
    }
}
