package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.ad.feed.adexperience.CommerceAdExperienceServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService;
import com.ss.android.ugc.aweme.ad.feed.adexperience.ImageInfo;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047660dMy implements ICommerceAdExperienceService {
    public static final C1047660dMy LIZIZ = new C1047660dMy();
    public final /* synthetic */ ICommerceAdExperienceService LIZ = CommerceAdExperienceServiceImpl.LIZ();

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean R2(Aweme aweme) {
        return this.LIZ.R2(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void S2(Context context, Aweme aweme, String str, String str2) {
        this.LIZ.S2(context, aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void T2(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ.T2(context, adLiveEnterRoomConfig, function0, function02);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void U2(Context context, Aweme aweme, String str, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ.U2(context, aweme, str, function0, function02);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final InterfaceC987400bnm V2(C987610bo7 c987610bo7) {
        return this.LIZ.V2(c987610bo7);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void W2(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, String str) {
        this.LIZ.W2(context, adLiveEnterRoomConfig, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final String X2(AwemeRawAd awemeRawAd) {
        return this.LIZ.X2(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final BottomBarPriorityProtocol Y2() {
        return this.LIZ.Y2();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean Z2(Aweme aweme) {
        return this.LIZ.Z2(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void a3(Context context, Aweme aweme, String str, Map<String, ? extends Object> map, boolean z, List<ImageInfo> list) {
        this.LIZ.a3(context, aweme, str, map, z, list);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean b3(Aweme aweme) {
        return this.LIZ.b3(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void c3(Context context, Comment comment) {
        this.LIZ.c3(context, comment);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void d3(Aweme aweme, String str) {
        this.LIZ.d3(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final C1048590dOT e3(Aweme aweme) {
        return this.LIZ.e3(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final List<String> f3(Aweme aweme) {
        return this.LIZ.f3(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean g3(Aweme aweme) {
        return this.LIZ.g3(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void h3(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, ? extends Object> map, String str8) {
        this.LIZ.h3(context, str, str2, str3, str4, str5, str6, str7, map, str8);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final C1048590dOT i3(Aweme aweme) {
        return this.LIZ.i3(aweme);
    }
}
