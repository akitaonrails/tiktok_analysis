package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0KeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522370KeB extends C09AY implements InterfaceC2280171EMt<String, String, Long, String, String, String, String, Unit> {
    public final /* synthetic */ MvChoosePhotoScene LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C522370KeB(MvChoosePhotoScene mvChoosePhotoScene) {
        super(7);
        this.LL = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC2280171EMt
    public final Unit yc(String str, String str2, Long l, String str3, String str4, String str5, String str6) {
        l.longValue();
        MvChoosePhotoScene mvChoosePhotoScene = this.LL;
        mvChoosePhotoScene.ugcTemplateUrl = str;
        mvChoosePhotoScene.ugcTemplateTitle = str4;
        mvChoosePhotoScene.ugcTemplateMd5 = str2;
        return Unit.LIZ;
    }
}
