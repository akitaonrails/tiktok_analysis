package X;

import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.RecordStickerSegmentInfo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448560nna extends C09AY implements Function1<C09FQ, Unit> {
    public C1448560nna() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C09FQ c09fq) {
        C09FQ c09fq2 = c09fq;
        GreenScreenMaterial.Companion.register(c09fq2);
        RecordStickerSegmentInfo.Companion.register(c09fq2);
        c09fq2.LIZ(String.class, "extra_key_ibe_info");
        c09fq2.LIZ(Integer.TYPE, "prop_customized_pic_cnt");
        c09fq2.LIZ(String.class, "prop_tab_id");
        c09fq2.LIZ(String.class, "stackable_item_list");
        c09fq2.LIZ(ArrayList.class, "prop_et_groups");
        return Unit.LIZ;
    }
}
