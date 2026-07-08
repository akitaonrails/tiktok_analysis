package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MO6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MO6 extends C09AY implements Function1<C0LAB, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MO6(int i, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = videoPublishEditModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LAB c0lab) {
        C0LAB c0lab2 = c0lab;
        c0lab2.LJ("content_type", "text_post");
        c0lab2.LIZ(this.LL, "is_has_last_content");
        c0lab2.LJ("shoot_enter_method", this.LLILLJJLI);
        c0lab2.LJ("shoot_enter_from", this.LLILLL);
        c0lab2.LJ("content_source", "edit");
        c0lab2.LJ("creation_id", this.LLILZ.getCreationId());
        c0lab2.LJ("shoot_way", "text_publish");
        return Unit.LIZ;
    }
}
