package X;

import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestCreateAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.AvatarBusinessAbilityImpl;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0bnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987240bnW implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<C936150aT7> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
            case 5:
                subscribe$5(this, c09aj);
                break;
        }
    }

    public C987240bnW(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C987240bnW c987240bnW, C09AJ c09aj) {
        C1C7U.LIZ("MultiGuestCreateAvatarFragment@ace6.ensureUploadEmitter$1");
        MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment = (MultiGuestCreateAvatarFragment) c987240bnW.l0;
        multiGuestCreateAvatarFragment.LLJJJ = c09aj;
        String str = multiGuestCreateAvatarFragment.LLJJIII;
        if (str != null) {
            MultiGuestCreateAvatarFragment.VR(multiGuestCreateAvatarFragment, str);
        } else {
            C823050WQl.LIZLLL().submit(new ARunnableS115S0100000_15(multiGuestCreateAvatarFragment, 101));
        }
        C1C7U.LIZIZ("MultiGuestCreateAvatarFragment@ace6.ensureUploadEmitter$1");
    }

    public static final void subscribe$1(C987240bnW c987240bnW, C09AJ c09aj) {
        C1C7U.LIZ("AvatarBusinessAbilityImpl@e9f5.avatarDownloadObservable$2$1");
        ((AvatarBusinessAbilityImpl) c987240bnW.l0).LLIZLLLIL = c09aj;
        C1C7U.LIZIZ("AvatarBusinessAbilityImpl@e9f5.avatarDownloadObservable$2$1");
    }

    public static final void subscribe$2(C987240bnW c987240bnW, C09AJ c09aj) {
        C1C7U.LIZ("MultiGuestCreateAvatarFragment@ace6.startToStylize$1");
        MultiGuestCreateAvatarFragment multiGuestCreateAvatarFragment = (MultiGuestCreateAvatarFragment) c987240bnW.l0;
        multiGuestCreateAvatarFragment.LLJJJIL = c09aj;
        C1319900kS4 c1319900kS4 = multiGuestCreateAvatarFragment.LLILLL;
        if (c1319900kS4 != null) {
            c1319900kS4.setInterceptTouch(true);
        }
        C1C7U.LIZIZ("MultiGuestCreateAvatarFragment@ace6.startToStylize$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void subscribe$3(C987240bnW c987240bnW, C09AJ c09aj) {
        C1C7U.LIZ("GenerateTask@b0b7.start$1");
        C936170aT9 c936170aT9 = (C936170aT9) c987240bnW.l0;
        c936170aT9.LIZLLL = c09aj;
        c09aj.onNext(new C936030aSv(c936170aT9, EnumC935940aSm.STATE_PROGRESS, 0, null, 0 == true ? 1 : 0, 24));
        C936170aT9 c936170aT92 = (C936170aT9) c987240bnW.l0;
        Avatar avatar = c936170aT92.LJIIIIZZ;
        if (avatar != null && avatar.status == 1) {
            C20441214yg.LIZIZ("GenerateTask", "downloadAvatar");
            c936170aT92.LJIIIIZZ = avatar;
            if (!c936170aT92.LJ) {
                C204692157q c204692157q = C204692157q.LIZ;
                C936190aTB c936190aTB = new C936190aTB(c936170aT92, avatar);
                c204692157q.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C204695157t(c936190aTB, avatar, null), 3);
            }
        } else if (c936170aT92.LJII != null) {
            c936170aT92.LIZLLL();
        } else {
            Function1<? super Function1<? super String, Unit>, Unit> function1 = c936170aT92.LIZIZ;
            if (function1 != null) {
                function1.invoke(new AwS594S0100000_15(c936170aT92, 670));
            } else {
                c09aj.onError(new Throwable("avatar get crop file error"));
            }
        }
        C1C7U.LIZIZ("GenerateTask@b0b7.start$1");
    }

    public static final void subscribe$4(C987240bnW c987240bnW, C09AJ c09aj) {
        ImageModel avatarThumb;
        User user;
        C1C7U.LIZ("MultiGuestV3ApplyInfoView@1a46.loadBitmap$1");
        C1289660jfI.LIZ = System.currentTimeMillis();
        C945740aia c945740aia = (C945740aia) c987240bnW.l0;
        LinkPlayerInfo anchorInfo = c945740aia.getAnchorInfo();
        ImageModel avatarThumb2 = null;
        if (anchorInfo != null && (user = anchorInfo.mUser) != null) {
            avatarThumb = user.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        User userLIZIZ = C0KXJ.LIZIZ();
        if (userLIZIZ != null) {
            avatarThumb2 = userLIZIZ.getAvatarThumb();
        }
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15((C19482611Ke) c09aj, 806);
        C013C c013c = new C013C();
        c945740aia.LJIIIIZZ(avatarThumb, "image_0", new AwS224S0300000_15(c945740aia, c013c, awS594S0100000_15, 48));
        c945740aia.LJIIIIZZ(avatarThumb2, "image_1", new AwS224S0300000_15(c945740aia, c013c, awS594S0100000_15, 49));
        C1C7U.LIZIZ("MultiGuestV3ApplyInfoView@1a46.loadBitmap$1");
    }

    public static final void subscribe$5(C987240bnW c987240bnW, C09AJ c09aj) {
        C1C7U.LIZ("MultiGuestV3ApplyInfoView@1a46.loadGecko$1");
        C945740aia c945740aia = (C945740aia) c987240bnW.l0;
        if (!c945740aia.LLILZ) {
            String strLIZ = C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_interaction_normal_1");
            C945740aia c945740aia2 = (C945740aia) c987240bnW.l0;
            C1143680frq.LJIIL(c945740aia, strLIZ, c945740aia2.LLILZLL, "images", false, new C987220bnU(c945740aia2, (C19482611Ke) c09aj, 1), Boolean.FALSE, null);
        } else {
            c09aj.onNext(Boolean.TRUE);
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("MultiGuestV3ApplyInfoView@1a46.loadGecko$1");
    }
}
