package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewStub;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursNoticeVideosResp;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11uW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19651011uW implements IAddYoursService {
    public static final C19651011uW LIZIZ = new C19651011uW();
    public final /* synthetic */ IAddYoursService LIZ = (IAddYoursService) ServiceManager.get().getService(IAddYoursService.class);

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LIZ(C0TGX c0tgx, ViewStub viewStub, C19EG c19eg) {
        this.LIZ.LIZ(c0tgx, viewStub, c19eg);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Pair<String, String>[] LIZIZ(Aweme aweme) {
        return this.LIZ.LIZIZ(aweme);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LIZJ(long j, String str, List list, C344460Deu c344460Deu) {
        return this.LIZ.LIZJ(j, str, list, c344460Deu);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LIZLLL(C19EG c19eg, Aweme aweme, AddYourRecordParam addYourRecordParam) {
        this.LIZ.LIZLLL(c19eg, aweme, addYourRecordParam);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJ(Context context, Aweme aweme, TextExtraStruct textExtraStruct, String str) {
        this.LIZ.LJ(context, aweme, textExtraStruct, str);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJFF(C19EG c19eg, String str, String str2) {
        this.LIZ.LJFF(c19eg, str, str2);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final C0OFL LJI(Context context) {
        return this.LIZ.LJI(context);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final IInterceptor LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJIIIZ(Aweme aweme, Object obj) {
        return this.LIZ.LJIIIZ(aweme, obj);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJIIJ(String str, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn) {
        return this.LIZ.LJIIJ(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIIJJI(Context context, Bundle bundle, String str, String str2, String str3) {
        this.LIZ.LJIIJJI(context, bundle, str, str2, str3);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final Object LJIIL(long j, InterfaceC1364105Vn<? super AddYoursStickerStruct> interfaceC1364105Vn) {
        return this.LIZ.LJIIL(j, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final AddYoursNoticeVideosResp LJIILIIL(int i, long j, long j2, String str) {
        return this.LIZ.LJIILIIL(i, j, j2, str);
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IAddYoursService
    public final void LJIILJJIL(Context context, AddYoursTopic addYoursTopic, Aweme aweme, Integer num, List<AddYoursAvatar> list, boolean z, String str, String str2, int i, String str3) {
        this.LIZ.LJIILJJIL(context, addYoursTopic, aweme, num, list, z, str, str2, i, str3);
    }
}
