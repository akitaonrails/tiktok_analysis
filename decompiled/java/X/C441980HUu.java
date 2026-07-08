package X;

import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerIconRedDotAbility;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS2S0900000_6;

/* JADX INFO: renamed from: X.0HUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441980HUu extends C09AY implements Function2<UIAssem, FrameLayout, Unit> {
    public final /* synthetic */ IStickerFeatureIconAbility LL;
    public final /* synthetic */ IStickerIconRedDotAbility LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepository LLILLL;
    public final /* synthetic */ IEmojiBtnAbility LLILZ;
    public final /* synthetic */ InterfaceC441960HUs LLILZIL;
    public final /* synthetic */ IInputFieldAbility LLILZLL;
    public final /* synthetic */ SessionInfo LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441980HUu(IStickerFeatureIconAbility iStickerFeatureIconAbility, IStickerIconRedDotAbility iStickerIconRedDotAbility, MixStudioStatusRepository mixStudioStatusRepository, IEmojiBtnAbility iEmojiBtnAbility, PanelStateViewModel panelStateViewModel, IInputFieldAbility iInputFieldAbility, SessionInfo sessionInfo) {
        super(2);
        this.LL = iStickerFeatureIconAbility;
        this.LLILLJJLI = iStickerIconRedDotAbility;
        this.LLILLL = mixStudioStatusRepository;
        this.LLILZ = iEmojiBtnAbility;
        this.LLILZIL = panelStateViewModel;
        this.LLILZLL = iInputFieldAbility;
        this.LLIZ = sessionInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, FrameLayout frameLayout) {
        UIAssem uIAssem2 = uIAssem;
        C723850SaN.LIZLLL(uIAssem2, new AwS2S0900000_6(uIAssem2, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, frameLayout, this.LLIZ, 1));
        return Unit.LIZ;
    }
}
