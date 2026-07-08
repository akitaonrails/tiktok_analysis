package X;

import Y.AObjectS240S0100000_5;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkShareFormat;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService;
import com.ss.android.ugc.aweme.tools.sticker.core.attributionlink.AttributionLinkStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.service.ILiveEventStoryStickerService;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.ILiveShare;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesResponseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.ISharedCommentStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.MemeSongTextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nv7.c0;

/* JADX INFO: renamed from: X.11qS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19625811qS extends AbstractC2255721DQs<InterfaceC391240FVq> implements InterfaceC391240FVq, InterfaceC379610EuV {
    public static final C19627711ql LLLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final C1DRG LL;
    public final Scene LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final boolean LLILZIL;
    public final InterfaceC1462140o9U LLILZLL;
    public InterfaceC1414530muh LLJILJILJ;
    public FrameLayout LLJILLL;
    public C0FT7 LLJLL;
    public boolean LLLFFI;
    public boolean LLLI;
    public final C560530Lyd<Boolean> LLLII;
    public final LiveEvent<Boolean> LLLIIII;
    public GestureInteractItem LLLIIIIL;
    public Pair<Integer, Integer> LLLIIIL;
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final C1466170oFz LLJJ = new C1466170oFz(LJJJLIIL());
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 653));
    public final Map<EnumC1466150oFx, Function1<StickerModel, Unit>> LLJJIII = new LinkedHashMap();
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1465010oE7.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19626511qZ.class, null);
    public final InterfaceC1731706qJ LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19627111qf.class, null);
    public final InterfaceC1731706qJ LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1410060mnU.class, null);
    public final InterfaceC1731706qJ LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19625711qR.class, null);
    public final InterfaceC1731706qJ LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461660o8i.class, null);
    public final InterfaceC1731706qJ LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1459040o4U.class, null);
    public final InterfaceC1731706qJ LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19627611qk.class, null);
    public final InterfaceC1731706qJ LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), C0EZ1.class, null);
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19627411qi.class, null);
    public final InterfaceC1731706qJ LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19627511qj.class, null);
    public final InterfaceC1731706qJ LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19624811qI.class, null);
    public final InterfaceC1731706qJ LLJLILLLLZIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19639511sf.class, null);
    public final InterfaceC1731706qJ LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
    public final InterfaceC1731706qJ LLJLLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
    public final InterfaceC1731706qJ LLJZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC379580EuS.class, null);
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 652));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 651));
    public final C0LDS LLLF = new C0LDS(new AwS549S0100000_5(this, 180));
    public final CopyOnWriteArrayList<Runnable> LLLFF = new CopyOnWriteArrayList<>();
    public boolean LLLFZ = true;

    public InterfaceC391240FVq o2() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [X.11ql] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19625811qS.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19625811qS.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C19625811qS.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C19625811qS.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C19625811qS.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C2217381BqS(C19625811qS.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C19625811qS.class, "addYoursStickerApi", "getAddYoursStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/addyours/EditAddYoursStickerApi;", 0), new C2217381BqS(C19625811qS.class, "liveCountDownStickerApi", "getLiveCountDownStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/livecd/EditLiveCountDownStickerApi;", 0), new C2217381BqS(C19625811qS.class, "mentionStickerNewApi", "getMentionStickerNewApi()Lcom/ss/android/ugc/gamora/editor/sticker/mention/EditMentionStickerNewApi;", 0), new C2217381BqS(C19625811qS.class, "textPovApi", "getTextPovApi()Lcom/ss/android/ugc/gamora/editor/sticker/pov/panel/EditTextPovApi;", 0), new C2217381BqS(C19625811qS.class, "hashTagStickerNewApi", "getHashTagStickerNewApi()Lcom/ss/android/ugc/gamora/editor/sticker/hashtag/EditHashTagStickerNewApi;", 0), new C2217381BqS(C19625811qS.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0), new C2217381BqS(C19625811qS.class, "musicStickerApi", "getMusicStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/music/EditMusicStickerApi;", 0), new C2217381BqS(C19625811qS.class, "editTextMentionApi", "getEditTextMentionApi()Lcom/ss/android/ugc/gamora/editor/sticker/mention/EditTextMentionApi;", 0), new C2217381BqS(C19625811qS.class, "lyricStickerApi", "getLyricStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditPageApi;", 0), new C2217381BqS(C19625811qS.class, "interactiveEmojiStickerApi", "getInteractiveEmojiStickerApi()Lcom/ss/android/ugc/aweme/social/sticker/service/interactiveemoji/EditInteractiveEmojiStickerApi;", 0), new C2217381BqS(C19625811qS.class, "emojiSliderStickerApi", "getEmojiSliderStickerApi()Lcom/ss/android/ugc/aweme/social/sticker/service/emojislider/EditEmojiSliderStickerApi;", 0), new C2217381BqS(C19625811qS.class, "linkStickerApi", "getLinkStickerApi()Lcom/ss/android/ugc/aweme/social/sticker/service/link/EditLinkStickerApi;", 0), new C2217381BqS(C19625811qS.class, "articleStickerApi", "getArticleStickerApi()Lcom/ss/android/ugc/aweme/tools/sticker/core/article/IArticleStickerManagerComponent;", 0), new C2217381BqS(C19625811qS.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0), new C2217381BqS(C19625811qS.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new C2217381BqS(C19625811qS.class, "editUILayerGroupApi", "getEditUILayerGroupApi()Lcom/ss/android/ugc/gamora/editor/EditUILayerGroupApiComponent;", 0)};
        LLLIIL = new Object() { // from class: X.11ql
        };
    }

    private final InterfaceC377540ErA B3() {
        return (InterfaceC377540ErA) this.LLJILJIL.getValue(this, LLLIILIL[5]);
    }

    private final InterfaceC1455850nzL G2() {
        return (InterfaceC1455850nzL) this.LLIZ.getValue(this, LLLIILIL[0]);
    }

    private final C2389209Xu K4() {
        return (C2389209Xu) this.LLL.getValue();
    }

    private final InterfaceC1461390o8H O3() {
        return (InterfaceC1461390o8H) this.LLJIJIL.getValue(this, LLLIILIL[4]);
    }

    private final C0FTB O4() {
        return new C0FTB() { // from class: X.11qT
            @Override // X.C0FTB
            public final void LIZJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJFF(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJII() {
            }

            @Override // X.C0FTB
            public final void LJIIIIZZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIILIIL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIILJJIL(int i) {
            }

            @Override // X.C0FTB
            public final void LJIILL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJLI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIL() {
            }

            @Override // X.C0FTB
            public final void LJJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
            }

            @Override // X.C0FTB
            public final void LJJIIJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
            }

            @Override // X.C0FTB
            public final void LJJIIZ() {
            }

            @Override // X.C0FTB
            public final void LJJIJ() {
            }

            @Override // X.C0FTB
            public final void LJJIJIIJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final EnumC1466150oFx[] LJJIJIL() {
                return EnumC1466150oFx.values();
            }

            @Override // X.C0FTB
            public final void LIZIZ(StickerModel stickerModel) {
                C1451630nsX c1451630nsXW2;
                if (stickerModel.getStickerType() == EnumC1466150oFx.TEXT && (c1451630nsXW2 = this.LL.W2()) != null) {
                    c1451630nsXW2.LIZIZ(AFwS273S0000000_29.get$arr$(210));
                }
            }

            @Override // X.C0FTB
            public final void LIZLLL(StickerModel stickerModel) {
                C19625811qS c19625811qS = this.LL;
                GestureInteractItem gestureInteractItem = c19625811qS.LLLIIIIL;
                if (gestureInteractItem != null) {
                    gestureInteractItem.LLILZIL = false;
                }
                c19625811qS.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJ(StickerModel stickerModel) {
                C19625811qS c19625811qS = this.LL;
                GestureInteractItem gestureInteractItem = c19625811qS.LLLIIIIL;
                if (gestureInteractItem != null) {
                    gestureInteractItem.LLILZIL = false;
                }
                c19625811qS.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJIIJJI(StickerModel stickerModel) {
                Function1<StickerModel, Unit> function1 = this.LL.LLJJIII.get(stickerModel.getStickerType());
                if (function1 != null) {
                    function1.invoke(stickerModel);
                }
            }

            @Override // X.C0FTB
            public final void LJIILLIIL(int i) {
                C0FT7 c0ft7 = this.LL.LLJLL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                C1403880mdW.LIZIZ(C1403880mdW.LIZ, this.LL.LJJJLIIL(), c0ft7.LLJJIJI(i), "click");
            }

            @Override // X.C0FTB
            public final void LJIIZILJ(StickerModel stickerModel) {
                C19625811qS c19625811qS = this.LL;
                GestureInteractItem gestureInteractItem = c19625811qS.LLLIIIIL;
                if (gestureInteractItem != null) {
                    gestureInteractItem.LLILZIL = false;
                }
                c19625811qS.h12(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJIJ(int i) {
                C0FT7 c0ft7 = null;
                this.LL.JF2(null, null);
                C0FT7 c0ft72 = this.LL.LLJLL;
                if (c0ft72 != null) {
                    c0ft7 = c0ft72;
                }
                StickerModel stickerModelLLJJIJI = c0ft7.LLJJIJI(i);
                if (stickerModelLLJJIJI == null) {
                    return;
                }
                this.LL.LLJJ.LJFF(Integer.valueOf(stickerModelLLJJIJI.getStickerType().getType()));
            }

            @Override // X.C0FTB
            public final void LJIJI(StickerModel stickerModel) {
                GestureInteractItem gestureInteractItem = this.LL.LLLIIIIL;
                if (gestureInteractItem != null) {
                    gestureInteractItem.LLILZIL = true;
                }
            }

            @Override // X.C0FTB
            public final void LJJ(StickerModel stickerModel) {
                this.LL.h12(stickerModel);
                InterfaceC1414530muh interfaceC1414530muh = this.LL.LLJILJILJ;
                if (interfaceC1414530muh != null) {
                    interfaceC1414530muh.bK1(new C1413010msF(false, false, null, false, false, 62));
                }
            }

            @Override // X.C0FTB
            public final void LJJIFFI(int i) {
                C0FT7 c0ft7 = this.LL.LLJLL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                StickerModel stickerModelLLJJIJI = c0ft7.LLJJIJI(i);
                if (stickerModelLLJJIJI == null) {
                    return;
                }
                this.LL.LLJJ.LIZLLL(Integer.valueOf(stickerModelLLJJIJI.getStickerType().getType()));
            }

            @Override // X.C0FTB
            public final void LJJIII(StickerModel stickerModel) {
                GestureInteractItem gestureInteractItem = this.LL.LLLIIIIL;
                if (gestureInteractItem != null) {
                    gestureInteractItem.LLILZIL = true;
                }
            }

            @Override // X.C0FTB
            public final void LJJIIZI(int i) {
                C0FT7 c0ft7 = this.LL.LLJLL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                StickerModel stickerModelLLJJIJI = c0ft7.LLJJIJI(i);
                if (stickerModelLLJJIJI == null) {
                    return;
                }
                this.LL.LLJJ.LJ(Integer.valueOf(stickerModelLLJJIJI.getStickerType().getType()));
            }

            @Override // X.C0FTB
            public final void LJJIJIIJIL(int i) {
                C0FT7 c0ft7 = this.LL.LLJLL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                C1403880mdW.LIZIZ(C1403880mdW.LIZ, this.LL.LJJJLIIL(), c0ft7.LLJJIJI(i), "change");
            }

            @Override // X.C0FTB
            public final void f4(StickerModel stickerModel) {
                InterfaceC1451520nsM interfaceC1451520nsMH2 = this.LL.H2();
                if (interfaceC1451520nsMH2 != null) {
                    interfaceC1451520nsMH2.jA();
                }
                this.LL.h12(stickerModel);
                this.LL.LLLII.LJIIIZ(Boolean.TRUE);
            }

            @Override // X.C0FTB
            public final void LIZ(StickerModel stickerModel, boolean z) {
                C1451630nsX c1451630nsXW2;
                this.LL.h12(stickerModel);
                if (stickerModel.getStickerType() == EnumC1466150oFx.TEXT && (c1451630nsXW2 = this.LL.W2()) != null) {
                    c1451630nsXW2.LIZIZ(AFwS273S0000000_29.get$arr$(211));
                }
                this.LL.LLLII.LJIIIZ(Boolean.TRUE);
            }

            @Override // X.C0FTB
            public final void LJI(StickerModel stickerModel, boolean z) {
                if (z) {
                    this.LL.JF2(null, null);
                } else {
                    if (stickerModel == null) {
                        return;
                    }
                    this.LL.h12(stickerModel);
                }
            }

            @Override // X.C0FTB
            public final void LJIIJ(StickerModel stickerModel, String str) {
                String str2;
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
                if (Intrinsics.LJFF(str, "SLIDE_UP")) {
                    str2 = "drag";
                } else {
                    str2 = "other";
                }
                this.LL.LLJJ.LIZJ(stickerModel, str2, 0);
                C1466090oFr.LIZJ(this.LL.LJJJLIIL().creativeModel.stickerModel, stickerModel);
                this.LL.LLLII.LJIIIZ(Boolean.FALSE);
            }

            @Override // X.C0FTB
            public final void LJIIL(StickerModel stickerModel, int i) {
                DonationStickerModel donationStickerModel;
                int i2 = 2;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 11 && C0FWJ.LIZIZ() && (stickerModel instanceof DonationStickerModel) && (donationStickerModel = (DonationStickerModel) stickerModel) != null) {
                            int displayStyle = donationStickerModel.getDisplayStyle();
                            int displayStyle2 = donationStickerModel.getDisplayStyle();
                            if (displayStyle2 != 1) {
                                if (displayStyle2 != 2) {
                                    if (displayStyle2 != 3) {
                                        i2 = 1;
                                    } else {
                                        i2 = 4;
                                    }
                                } else {
                                    i2 = 3;
                                }
                            }
                            DonationStickerModel donationStickerModelCopy = donationStickerModel.copy(donationStickerModel.baseStickerModel, donationStickerModel.visible, donationStickerModel.clickable, donationStickerModel.name, donationStickerModel.iconUri, donationStickerModel.donateLink, donationStickerModel.addTime, donationStickerModel.orgId, donationStickerModel.orgType, donationStickerModel.fundraiserId, donationStickerModel.fundraiserOwnerId, donationStickerModel.fundraiserGoalDesc, i2, donationStickerModel.initialTransformScale, donationStickerModel.legacyDonationNoDisplayStyleAttr, donationStickerModel.isDynamicRender);
                            this.LL.k3(donationStickerModelCopy, EnumC356070Dxd.COMMIT);
                            this.LL.h12(donationStickerModelCopy);
                            this.LL.LLJJ.LIZIZ(displayStyle, donationStickerModelCopy.getDisplayStyle(), donationStickerModelCopy);
                            this.LL.LLLII.LJIIIZ(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    this.LL.c3().rb().setValue(Boolean.TRUE);
                    return;
                }
                C20684815ws.LJIILLIIL("prop_more_click_edit", this.LL.LLJJ.LIZ(stickerModel.getStickerType().getType()).LIZ);
            }
        };
    }

    private final InterfaceC1459040o4U Qr2() {
        return (InterfaceC1459040o4U) this.LLJJJJJIL.getValue(this, LLLIILIL[12]);
    }

    private final InterfaceC388760FMc T2() {
        return (InterfaceC388760FMc) this.LLJJI.getValue();
    }

    private final InterfaceC1452170ntP T4() {
        return (InterfaceC1452170ntP) this.LLJZIJLIL.getValue();
    }

    private final InterfaceC1461660o8i i3() {
        return (InterfaceC1461660o8i) this.LLJJJJ.getValue(this, LLLIILIL[11]);
    }

    private final void n5() {
        this.LLJILLL = new FrameLayout(C1664590tQ1.LJIIIZ(this));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.LLILLL;
        FrameLayout frameLayout2 = this.LLJILLL;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        frameLayout.addView(frameLayout2, layoutParams);
    }

    private final C0FT7 t5() {
        Integer num;
        Integer num2;
        NavigationScene navigationSceneLIZ;
        Function1<StickerModel, Unit> function1Pi;
        Function1<StickerModel, Unit> function1Pi2;
        boolean z = (u4.LJLL(LJJJLIIL()) || C1444940nhk.LJFF(LJJJLIIL().getCanvasVideoData())) && ((Number) C0BE3.LIZ.getValue()).intValue() == 1;
        List<C0FFO> listW1 = W1();
        String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), LJJJLIIL().getCreativeInfo(), EnumC20228214Cy.INFO_STICKER, null, false, 12);
        int i = z ? 62 : 164;
        Integer num3 = z ? 62 : null;
        if (z) {
            num = 12;
            num2 = 12;
        } else {
            num = null;
            num2 = null;
        }
        C0FUH c0fuh = new C0FUH(strLIZLLL, num3, i, num, num2, true, z, !z, false, listW1, null, false, false, false, 0, false, 521219);
        Activity activityLJII = C1664590tQ1.LJII(this);
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C390390FSj c390390FSj = new C390390FSj(activityLJII, frameLayout, this.LLILZ, c0fuh, T2(), this.LLILLJJLI);
        this.LLJJIII.put(EnumC1466150oFx.ADD_YOURS, new AwS608S0100000_29(this, 363));
        this.LLJJIII.put(EnumC1466150oFx.INTERACTIVE_EMOJI, new AwS608S0100000_29(this, 364));
        this.LLJJIII.put(EnumC1466150oFx.EMOJI_SLIDER, new AwS608S0100000_29(this, 365));
        this.LLJJIII.put(EnumC1466150oFx.LINK, new AwS608S0100000_29(this, 366));
        InterfaceC1459040o4U interfaceC1459040o4UQr2 = Qr2();
        if (interfaceC1459040o4UQr2 != null && (function1Pi2 = interfaceC1459040o4UQr2.Pi()) != null) {
            this.LLJJIII.put(EnumC1466150oFx.MUSIC_STICKER, function1Pi2);
        }
        C0FVT c0fvtQ3 = q3();
        if (c0fvtQ3 != null && (function1Pi = c0fvtQ3.Pi()) != null) {
            this.LLJJIII.put(EnumC1466150oFx.TEXT, function1Pi);
        }
        InterfaceC19626511qZ interfaceC19626511qZZ4 = z4();
        if (interfaceC19626511qZZ4 != null) {
            this.LLJJIII.put(EnumC1466150oFx.LIVE_COUNTDOWN, new AwS608S0100000_29(interfaceC19626511qZZ4, 367));
            this.LLJJIII.put(EnumC1466150oFx.LIVE_EVENT_COUNTDOWN, new AwS608S0100000_29(interfaceC19626511qZZ4, 368));
        }
        c390390FSj.LJJZZI(O4());
        GestureInteractItem gestureInteractItem = new GestureInteractItem(550, c390390FSj.LJIIIIZZ);
        this.LLLIIIIL = gestureInteractItem;
        O3().LIZIZ(gestureInteractItem);
        c390390FSj.initService();
        Scene scene = this.LLILLJJLI;
        if (scene != null && (navigationSceneLIZ = C1447800nmM.LIZ(scene)) != null) {
            navigationSceneLIZ.LLLIILIL(scene, new C0FXH(c390390FSj, 0));
        }
        C0FLH c0flhLJIILLIIL = T2().LJIILLIIL();
        if (c0flhLJIILLIIL != null && c0flhLJIILLIIL.LLLLLIL()) {
            c0flhLJIILLIIL.LLLLLILLIL(null, null);
        }
        return c390390FSj;
    }

    private final InterfaceC379580EuS v3() {
        return (InterfaceC379580EuS) this.LLJZ.getValue(this, LLLIILIL[21]);
    }

    public final InterfaceC19627511qj E3() {
        return (InterfaceC19627511qj) this.LLJL.getValue(this, LLLIILIL[16]);
    }

    public final InterfaceC19627111qf F4() {
        return (InterfaceC19627111qf) this.LLJJIJIL.getValue(this, LLLIILIL[8]);
    }

    public final InterfaceC1451520nsM H2() {
        return (InterfaceC1451520nsM) this.LLJLLL.getValue(this, LLLIILIL[20]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLIZLLLIL.getValue(this, LLLIILIL[1]);
    }

    @Override // X.InterfaceC391240FVq
    public InterfaceC1444160ngU LJJIFFI() {
        return new InterfaceC1444160ngU() { // from class: X.11qY
            @Override // X.InterfaceC1444160ngU
            public final boolean ve1(RectF rectF) {
                List<StickerModel> listLIZLLL;
                C0FT7 c0ft7 = this.LL.LLJLL;
                if (c0ft7 == null || (listLIZLLL = c0ft7.LIZLLL()) == null || listLIZLLL.isEmpty()) {
                    return false;
                }
                for (StickerModel stickerModel : listLIZLLL) {
                    RectF visibleRectWithoutRotationInContainer = stickerModel.getBaseModel().getVisibleRectWithoutRotationInContainer();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(stickerModel.getBaseModel().getRotation(), visibleRectWithoutRotationInContainer.centerX(), visibleRectWithoutRotationInContainer.centerY());
                    matrix.mapRect(visibleRectWithoutRotationInContainer);
                    if (visibleRectWithoutRotationInContainer.top < rectF.top || visibleRectWithoutRotationInContainer.bottom > rectF.bottom || (C301490Brn.LIZ() && (visibleRectWithoutRotationInContainer.left < rectF.left || visibleRectWithoutRotationInContainer.right > rectF.right))) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJI.getValue(this, LLLIILIL[3]);
    }

    public final InterfaceC1410060mnU P4() {
        return (InterfaceC1410060mnU) this.LLJJJ.getValue(this, LLLIILIL[9]);
    }

    @Override // X.InterfaceC391240FVq
    public void Ps0() {
        C0FG9.LIZ.getClass();
        if (C0FG9.LIZ()) {
            C0FT7 c0ft7 = this.LLJLL;
            if (c0ft7 == null) {
                c0ft7 = null;
            }
            c0ft7.Ja().LJII().LJ();
        }
    }

    public final InterfaceC19625711qR Q3() {
        return (InterfaceC19625711qR) this.LLJJJIL.getValue(this, LLLIILIL[10]);
    }

    @Override // X.InterfaceC391240FVq
    public void RG1() {
        C0FG9.LIZ.getClass();
        if (C0FG9.LIZ()) {
            C0FT7 c0ft7 = this.LLJLL;
            if (c0ft7 == null) {
                c0ft7 = null;
            }
            c0ft7.Ja().LJII().LJIIIZ();
        }
    }

    @Override // X.InterfaceC391240FVq
    public void Vv() {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.Vv();
    }

    public final C1451630nsX W2() {
        return (C1451630nsX) this.LLJLLIL.getValue(this, LLLIILIL[19]);
    }

    public final C0EZ1 WM2() {
        return (C0EZ1) this.LLJJL.getValue(this, LLLIILIL[14]);
    }

    @Override // X.InterfaceC391240FVq
    public View aS() {
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    @Override // X.InterfaceC391240FVq
    public Pair<Integer, Integer> al() {
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        Integer numValueOf = Integer.valueOf(frameLayout.getLayoutParams().width);
        FrameLayout frameLayout2 = this.LLJILLL;
        return new Pair<>(numValueOf, Integer.valueOf((frameLayout2 != null ? frameLayout2 : null).getLayoutParams().height));
    }

    public final InterfaceC1461350o8D c3() {
        return (InterfaceC1461350o8D) this.LLJ.getValue(this, LLLIILIL[2]);
    }

    @Override // X.InterfaceC391240FVq
    public boolean ck() {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.Ja().LJIIIZ();
    }

    public final InterfaceC388760FMc d5() {
        return new InterfaceC388760FMc() { // from class: X.11qa
            @Override // X.InterfaceC388760FMc
            public final C0FEQ LJFF() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUB LJII() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKH LJIIJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIFFI() {
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJII() {
            }

            @Override // X.InterfaceC388760FMc
            public final C0FF8 LIZ() {
                C0FVT c0fvtQ3 = this.LIZ.q3();
                if (c0fvtQ3 != null) {
                    return c0fvtQ3.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC386690FEd LIZIZ() {
                return new C386390FCz(this.LIZ.H4());
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19628411qs LIZJ() {
                InterfaceC19627111qf interfaceC19627111qfF4 = this.LIZ.F4();
                if (interfaceC19627111qfF4 != null) {
                    return interfaceC19627111qfF4.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19639511sf LIZLLL() {
                return this.LIZ.w2();
            }

            @Override // X.InterfaceC388760FMc
            public final float LJ() {
                if (this.LIZ.H4() != null) {
                    return r0.LLL();
                }
                return 0.0f;
            }

            @Override // X.InterfaceC388760FMc
            public final float LJI() {
                if (this.LIZ.H4() != null) {
                    return r0.getDuration();
                }
                return 0.0f;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19627911qn LJIIIIZZ() {
                InterfaceC19626511qZ interfaceC19626511qZZ4 = this.LIZ.z4();
                if (interfaceC19626511qZZ4 != null) {
                    return interfaceC19626511qZZ4.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C19647711tz LJIIIZ() {
                return this.LIZ.k5();
            }

            @Override // X.InterfaceC388760FMc
            public final C390610FTf LJIIJJI() {
                return new C390610FTf(new AwS573S0100000_29(this.LIZ, 649), new AwS573S0100000_29(this.LIZ, 650));
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19604511n1 LJIIL() {
                InterfaceC19627511qj interfaceC19627511qjE3 = this.LIZ.E3();
                if (interfaceC19627511qjE3 != null) {
                    return interfaceC19627511qjE3.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC390170FRn LJIILIIL() {
                InterfaceC1465010oE7 interfaceC1465010oE7Zi0;
                if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || (interfaceC1465010oE7Zi0 = this.LIZ.zi0()) == null) {
                    return null;
                }
                return interfaceC1465010oE7Zi0.LJIIJ();
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19656311vN LJIILL() {
                InterfaceC19624811qI interfaceC19624811qIO4 = this.LIZ.o4();
                if (interfaceC19624811qIO4 != null) {
                    return interfaceC19624811qIO4.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FLH LJIILLIIL() {
                InterfaceC19627611qk interfaceC19627611qkM3 = this.LIZ.m3();
                if (interfaceC19627611qkM3 != null) {
                    return interfaceC19627611qkM3.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> LJIIZILJ() {
                return (this.LIZ.LJJJLIIL().isCurrentAutoCutMode() && (this.LIZ.H4() instanceof C1463670oBx)) ? u4.LJLI((C1463670oBx) this.LIZ.H4()) : getVideoList();
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19605411nA LJIJ() {
                InterfaceC19627411qi interfaceC19627411qiE4 = this.LIZ.e4();
                if (interfaceC19627411qiE4 != null) {
                    return interfaceC19627411qiE4.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJ() {
                return this.LIZ.LJJJLIIL().isMultiVideoEdit();
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJLI() {
                return this.LIZ.LJJJLIIL().creativeModel.editModel.showFirstTimeAnim;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FL9 LJIL() {
                InterfaceC1410060mnU interfaceC1410060mnUP4 = this.LIZ.P4();
                if (interfaceC1410060mnUP4 != null) {
                    return interfaceC1410060mnUP4.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKI LJJ() {
                C1664590tQ1.LJIIIZ(this.LIZ);
                return new C0FIG();
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJI() {
                this.LIZ.LJJJLIIL().creativeModel.editModel.showFirstTimeAnim = false;
            }

            @Override // X.InterfaceC388760FMc
            public final int LJJIII() {
                return (int) this.LIZ.LJJJLIIL().getMultiEditVideoStartTime();
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJZLJL() {
                C388320FKk.LIZ.i("EditInfiniStickerComponent openAYEdit");
                InterfaceC1465010oE7 interfaceC1465010oE7Zi0 = this.LIZ.zi0();
                if (interfaceC1465010oE7Zi0 != null) {
                    interfaceC1465010oE7Zi0.LJLLL("");
                }
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19614111oZ getHashTagService() {
                InterfaceC19625711qR interfaceC19625711qRQ3 = this.LIZ.Q3();
                if (interfaceC19625711qRQ3 != null) {
                    return interfaceC19625711qRQ3.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> getVideoList() {
                LivePhotoModel livePhotoModel = this.LIZ.LJJJLIIL().creativeModel.livePhotoModel;
                if (livePhotoModel == null || !livePhotoModel.enableLiveMode || C1416310mxZ.LJJIIJZLJL(this.LIZ.LJJJLIIL()) == null) {
                    return this.LIZ.LJJJLIIL().getMediaModelList();
                }
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordDataLJJIIJZLJL = C1416310mxZ.LJJIIJZLJL(this.LIZ.LJJJLIIL());
                MediaModel mediaModelConvertModel = multiEditVideoSegmentRecordDataLJJIIJZLJL != null ? multiEditVideoSegmentRecordDataLJJIIJZLJL.convertModel() : null;
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordDataLJJIIJ = C1416310mxZ.LJJIIJ(this.LIZ.LJJJLIIL());
                MediaModel mediaModelConvertModel2 = multiEditVideoSegmentRecordDataLJJIIJ != null ? multiEditVideoSegmentRecordDataLJJIIJ.convertModel() : null;
                if (mediaModelConvertModel == null || mediaModelConvertModel2 == null) {
                    return C13BV.INSTANCE;
                }
                int i = C570510MZd.LIZ[livePhotoModel.previewMode.ordinal()];
                if (i == 1 || i == 2) {
                    long j = livePhotoModel.durationMs;
                    mediaModelConvertModel2.duration = j;
                    mediaModelConvertModel2.startTime = 0;
                    mediaModelConvertModel2.endTime = (int) j;
                    return Collections.singletonList(mediaModelConvertModel2);
                }
                if (i != 3) {
                    throw new C1954807lC();
                }
                long j2 = livePhotoModel.durationMs;
                mediaModelConvertModel.duration = j2;
                mediaModelConvertModel.startTime = 0;
                mediaModelConvertModel.endTime = (int) j2;
                return Collections.singletonList(mediaModelConvertModel);
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUI w() {
                C0EZ1 c0ez1WM2 = this.LIZ.WM2();
                if (c0ez1WM2 != null) {
                    return c0ez1WM2.w();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIILJJIL(int i) {
                C1456890o11 value = this.LIZ.JY0().Yh().getValue();
                if (value != null && value.LIZ && !value.LIZIZ && value.LIZJ) {
                    return;
                }
                C1456140nzo.LIZIZ(this.LIZ.JY0(), true, false, true, false, 8);
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIJI(boolean z) {
                this.LIZ.X1(z);
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJ(int i) {
                C1456890o11 value = this.LIZ.JY0().Yh().getValue();
                if (value != null && !value.LIZ && !value.LIZIZ && !value.LIZJ) {
                    return;
                }
                C1456140nzo.LIZIZ(this.LIZ.JY0(), false, false, false, false, 8);
            }
        };
    }

    @Override // X.InterfaceC391240FVq
    public InterfaceC390990FUr dC2() {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            return c0ft7.Ja().LIZLLL();
        }
        return null;
    }

    public final InterfaceC19627411qi e4() {
        return (InterfaceC19627411qi) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLIILIL[15]);
    }

    @Override // X.InterfaceC391240FVq
    public void hide() {
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJZ(4, frameLayout);
        C786410Ut5.LJZ(4, this.LLILZ);
    }

    public final InterfaceC19627611qk m3() {
        return (InterfaceC19627611qk) this.LLJJJJLIIL.getValue(this, LLLIILIL[13]);
    }

    public final InterfaceC19624811qI o4() {
        return (InterfaceC19624811qI) this.LLJLIL.getValue(this, LLLIILIL[17]);
    }

    @Override // X.InterfaceC391240FVq
    public List<StickerModel> s32() {
        C0FT7 c0ft7 = this.LLJLL;
        return c0ft7 == null ? C13BV.INSTANCE : c0ft7.LIZLLL();
    }

    @Override // X.InterfaceC391240FVq
    public InterfaceC19530911b9 sd2() {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            return c0ft7.Ja().LJIIIIZZ();
        }
        return null;
    }

    @Override // X.InterfaceC391240FVq
    public void show() {
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJZ(0, frameLayout);
        C786410Ut5.LJZ(0, this.LLILZ);
    }

    @Override // X.InterfaceC391240FVq
    public C390640FTi uM0() {
        C0FT7 c0ft7 = this.LLJLL;
        return c0ft7 != null ? c0ft7.Ja().LJ() : new C390640FTi(0, 1023);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC391240FVq
    public void ud() {
        VESize vESize;
        List<MemeSongTextStickerModel> arrayList;
        StickerNewEngineModel stickerNewEngineModel;
        C1402840mbq shareContext;
        AttributionLinkStickerStruct attributionLinkStickerStruct;
        String strLIZIZ;
        InterfaceC1452170ntP interfaceC1452170ntPH4 = H4();
        if (interfaceC1452170ntPH4 == null || (vESize = interfaceC1452170ntPH4.getInitSize()) == null) {
            vESize = new VESize(720, 1080);
        }
        C0MOG c0mog = C576250Mit.LLJJIJIIJIL;
        CreativeModel creativeModel = LJJJLIIL().creativeModel;
        int i = vESize.width;
        int i2 = vESize.height;
        c0mog.getClass();
        C0MOG.LIZIZ(creativeModel, i, i2);
        C2389209Xu c2389209XuK4 = K4();
        int i3 = vESize.width;
        int i4 = vESize.height;
        BaseStickerModel baseStickerModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (c2389209XuK4.LIZ().creativeModel.changeAvatarModel.isFromChangeAvatar && ((c2389209XuK4.LIZ().creativeModel.changeAvatarModel.isFromSocialAvatar && !c2389209XuK4.LIZ().hasTextSticker()) || ((!c2389209XuK4.LIZ().creativeModel.draftInfoModel.isDraft || c2389209XuK4.LIZ().isFromCrash()) && c2389209XuK4.LIZ().creativeModel.changeAvatarModel.firstEnterEdit))) {
            c2389209XuK4.LIZ().hasTextSticker();
            if (c2389209XuK4.LIZ().creativeModel.changeAvatarModel.isFromSocialAvatar) {
                strLIZIZ = C20642515q3.LJI(2131827094);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((char) 10024);
                sbLIZ.append(C20642515q3.LJI(2131845022));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C1465480oEs c1465480oEs = new C1465480oEs();
            Activity activity = (Activity) c2389209XuK4.LLILLL.getValue(c2389209XuK4, C2389209Xu.LLILZLL[1]);
            if (activity == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            List listLIZIZ = c1465480oEs.LIZIZ(activity, c2389209XuK4.LIZ(), strLIZIZ);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            int i5 = 0;
            for (TextStickerData textStickerData : (ArrayList) listLIZIZ) {
                textStickerData.setIdInNewEngine(i5);
                i5++;
                arrayList2.add(C0F7U.LJ(textStickerData, new Pair(Integer.valueOf(i3 / 2), Integer.valueOf(i4 / 2)), 1));
            }
            c2389209XuK4.LIZ().creativeModel.stickerModel.textStickerModels.addAll(arrayList2);
            if (c2389209XuK4.LIZ().creativeModel.changeAvatarModel.isFromSocialAvatar && C297450BlH.LIZ()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2389109Xt(c2389209XuK4, null), 3);
            }
        }
        Z1();
        C1429890nJT mainBusinessContext = LJJJLIIL().getMainBusinessContext();
        if (mainBusinessContext != null && (shareContext = mainBusinessContext.getShareContext()) != null && (attributionLinkStickerStruct = shareContext.attributionLinkStickerStruct) != null && attributionLinkStickerStruct.getShareFormat() == AttributionLinkShareFormat.ATTRIBUTION_LINK_SHARE_FORMAT_GREEN_SCREEN.getValue()) {
            C0FT7 c0ft7 = this.LLJLL;
            if (c0ft7 == null) {
                c0ft7 = null;
            }
            boolean z = false;
            c0ft7.f3(new AttributionLinkStickerModel(baseStickerModel, z, z, z, objArr4 == true ? 1 : 0, attributionLinkStickerStruct.getTitle(), objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, attributionLinkStickerStruct.getMediaSize(), 219, objArr == true ? 1 : 0), EnumC356070Dxd.COMMIT);
        }
        if (!C1428650nHT.LIZ()) {
            for (AddYoursStickerModel addYoursStickerModel : LJJJLIIL().creativeModel.stickerModel.addYoursStickerModels) {
                C0FT7 c0ft72 = this.LLJLL;
                if (c0ft72 == null) {
                    c0ft72 = null;
                }
                c0ft72.f3(addYoursStickerModel, EnumC356070Dxd.COMMIT);
            }
        }
        if (C1403850mdT.LJI(LJJJLIIL())) {
            for (MusicStickerModel musicStickerModel : LJJJLIIL().creativeModel.stickerModel.musicStickerModels) {
                C0FT7 c0ft73 = this.LLJLL;
                if (c0ft73 == null) {
                    c0ft73 = null;
                }
                c0ft73.f3(musicStickerModel, EnumC356070Dxd.COMMIT);
            }
        }
        InterfaceC377540ErA interfaceC377540ErAB3 = B3();
        if ((interfaceC377540ErAB3 == null || !interfaceC377540ErAB3.isShowing()) && C1416310mxZ.LJJLIIIJJIZ(LJJJLIIL())) {
            List<TextStickerModel> listLJJIJIL = C1416310mxZ.LJJIJIL(LJJJLIIL());
            C0FT7 c0ft74 = this.LLJLL;
            if (c0ft74 == null) {
                c0ft74 = null;
            }
            c0ft74.w3(listLJJIJIL, EnumC356070Dxd.COMMIT);
        }
        CreativeModel creativeModel2 = LJJJLIIL().creativeModel;
        if (creativeModel2 == null || (stickerNewEngineModel = creativeModel2.stickerModel) == null || (arrayList = stickerNewEngineModel.memeSongTextStickerModels) == null) {
            arrayList = new ArrayList();
        }
        for (MemeSongTextStickerModel memeSongTextStickerModel : arrayList) {
            C0FT7 c0ft75 = this.LLJLL;
            if (c0ft75 == null) {
                c0ft75 = null;
            }
            c0ft75.f3(memeSongTextStickerModel, EnumC356070Dxd.COMMIT);
        }
        List<LyricStickerModel> list = LJJJLIIL().creativeModel.stickerModel.lyricStickerModels;
        if (!list.isEmpty()) {
            C0FT7 c0ft76 = this.LLJLL;
            if (c0ft76 == null) {
                c0ft76 = null;
            }
            c0ft76.w3(list, EnumC356070Dxd.COMMIT);
        }
        for (LocationStickerModel locationStickerModel : LJJJLIIL().creativeModel.stickerModel.locationStickerModels) {
            C0FT7 c0ft77 = this.LLJLL;
            if (c0ft77 == null) {
                c0ft77 = null;
            }
            c0ft77.f3(locationStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (InteractiveEmojiStickerModel interactiveEmojiStickerModel : LJJJLIIL().creativeModel.stickerModel.interactiveEmojiStickerModels) {
            C0FT7 c0ft78 = this.LLJLL;
            if (c0ft78 == null) {
                c0ft78 = null;
            }
            c0ft78.f3(interactiveEmojiStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (EmojiSliderStickerModel emojiSliderStickerModel : LJJJLIIL().creativeModel.stickerModel.emojiSliderStickerModels) {
            C0FT7 c0ft79 = this.LLJLL;
            if (c0ft79 == null) {
                c0ft79 = null;
            }
            c0ft79.f3(emojiSliderStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (LinkStickerModel linkStickerModel : LJJJLIIL().creativeModel.stickerModel.linkStickerModels) {
            C0FT7 c0ft710 = this.LLJLL;
            if (c0ft710 == null) {
                c0ft710 = null;
            }
            c0ft710.f3(linkStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (ArticleStickerModel articleStickerModel : LJJJLIIL().creativeModel.stickerModel.articleStickers) {
            C0FT7 c0ft711 = this.LLJLL;
            if (c0ft711 == null) {
                c0ft711 = null;
            }
            c0ft711.f3(articleStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (PollStickerModel pollStickerModel : LJJJLIIL().creativeModel.stickerModel.pollStickers) {
            C0FT7 c0ft712 = this.LLJLL;
            if (c0ft712 == null) {
                c0ft712 = null;
            }
            c0ft712.f3(pollStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (LiveCountDownStickerModel liveCountDownStickerModel : LJJJLIIL().creativeModel.stickerModel.liveCountDownStickerModel) {
            C0FT7 c0ft713 = this.LLJLL;
            if (c0ft713 == null) {
                c0ft713 = null;
            }
            c0ft713.f3(liveCountDownStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (LiveEventCountDownStickerModel liveEventCountDownStickerModel : LJJJLIIL().creativeModel.stickerModel.liveEventCountDownStickerModel) {
            C0FT7 c0ft714 = this.LLJLL;
            if (c0ft714 == null) {
                c0ft714 = null;
            }
            c0ft714.f3(liveEventCountDownStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (DonationStickerModel donationStickerModel : LJJJLIIL().creativeModel.stickerModel.donationStickers) {
            C0FT7 c0ft715 = this.LLJLL;
            if (c0ft715 == null) {
                c0ft715 = null;
            }
            c0ft715.f3(donationStickerModel, EnumC356070Dxd.COMMIT);
        }
        List<MentionStickerModel> listLLIIII = C13LP.LLIIII(LJJJLIIL().creativeModel.stickerModel.mentionStickerModel);
        LJJJLIIL().creativeModel.stickerModel.mentionStickerModel.clear();
        for (MentionStickerModel mentionStickerModel : listLLIIII) {
            C0FT7 c0ft716 = this.LLJLL;
            if (c0ft716 == null) {
                c0ft716 = null;
            }
            c0ft716.f3(mentionStickerModel, EnumC356070Dxd.COMMIT);
        }
        List<HashTagStickerModel> listLLIIII2 = C13LP.LLIIII(LJJJLIIL().creativeModel.stickerModel.hashtagStickerModel);
        LJJJLIIL().creativeModel.stickerModel.hashtagStickerModel.clear();
        for (HashTagStickerModel hashTagStickerModel : listLLIIII2) {
            C0FT7 c0ft717 = this.LLJLL;
            if (c0ft717 == null) {
                c0ft717 = null;
            }
            c0ft717.f3(hashTagStickerModel, EnumC356070Dxd.COMMIT);
        }
        if (!C1428470nHB.LLIIIJ(LJJJLIIL())) {
            for (CommentStickerModel commentStickerModel : LJJJLIIL().creativeModel.stickerModel.commentStickerModels) {
                C0FT7 c0ft718 = this.LLJLL;
                if (c0ft718 == null) {
                    c0ft718 = null;
                }
                c0ft718.f3(commentStickerModel, EnumC356070Dxd.COMMIT);
            }
        }
        for (LiveShareStickerModel liveShareStickerModel : LJJJLIIL().creativeModel.stickerModel.liveShareStickerModels) {
            C0FT7 c0ft719 = this.LLJLL;
            if (c0ft719 == null) {
                c0ft719 = null;
            }
            c0ft719.f3(liveShareStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (SharedCommentStickerModel sharedCommentStickerModel : LJJJLIIL().creativeModel.stickerModel.sharedCommentStickerModels) {
            C0FT7 c0ft720 = this.LLJLL;
            if (c0ft720 == null) {
                c0ft720 = null;
            }
            c0ft720.f3(sharedCommentStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (SecretRepliesStickerModel secretRepliesStickerModel : LJJJLIIL().creativeModel.stickerModel.secretRepliesStickerModel) {
            C0FT7 c0ft721 = this.LLJLL;
            if (c0ft721 == null) {
                c0ft721 = null;
            }
            c0ft721.f3(secretRepliesStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (SecretRepliesResponseStickerModel secretRepliesResponseStickerModel : LJJJLIIL().creativeModel.stickerModel.secretRepliesResponseStickerModel) {
            C0FT7 c0ft722 = this.LLJLL;
            if (c0ft722 == null) {
                c0ft722 = null;
            }
            c0ft722.f3(secretRepliesResponseStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (SocialAvatarStickerModel socialAvatarStickerModel : LJJJLIIL().creativeModel.stickerModel.socialAvatarStickerModels) {
            C0FT7 c0ft723 = this.LLJLL;
            if (c0ft723 == null) {
                c0ft723 = null;
            }
            c0ft723.f3(socialAvatarStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (LiveEventStoryStickerModel liveEventStoryStickerModel : LJJJLIIL().creativeModel.stickerModel.liveEventStoryStickerModel) {
            C0FT7 c0ft724 = this.LLJLL;
            if (c0ft724 == null) {
                c0ft724 = null;
            }
            c0ft724.f3(liveEventStoryStickerModel, EnumC356070Dxd.COMMIT);
        }
        for (DMGroupChatStickerModel dMGroupChatStickerModel : LJJJLIIL().creativeModel.stickerModel.dmGroupChatStickerModel) {
            C0FT7 c0ft725 = this.LLJLL;
            if (c0ft725 == null) {
                c0ft725 = null;
            }
            c0ft725.f3(dMGroupChatStickerModel, EnumC356070Dxd.COMMIT);
        }
        KN2();
        this.LLLFFI = true;
        Iterator<Runnable> it2 = this.LLLFF.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.LLLFF.clear();
    }

    @Override // X.InterfaceC391240FVq
    public InterfaceC19657911vd up0() {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            return c0ft7.Ja().LJFF();
        }
        return null;
    }

    @Override // X.InterfaceC391240FVq
    public boolean vs0() {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.Ja().LJFF().LJIILIIL().LIZ.LIZIZ;
    }

    public final InterfaceC19639511sf w2() {
        return (InterfaceC19639511sf) this.LLJLILLLLZIIL.getValue(this, LLLIILIL[18]);
    }

    public final InterfaceC19626511qZ z4() {
        return (InterfaceC19626511qZ) this.LLJJIJIIJIL.getValue(this, LLLIILIL[7]);
    }

    public final InterfaceC1465010oE7 zi0() {
        return (InterfaceC1465010oE7) this.LLJJIJI.getValue(this, LLLIILIL[6]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v33 */
    /* JADX WARN: Type inference failed for: r24v34 */
    /* JADX WARN: Type inference failed for: r24v35 */
    /* JADX WARN: Type inference failed for: r24v36 */
    /* JADX WARN: Type inference failed for: r24v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r34v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r36v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r37v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r41v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r42v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r44v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r45v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r46v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r51v0 */
    /* JADX WARN: Type inference failed for: r51v1 */
    /* JADX WARN: Type inference failed for: r52v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r52v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r53v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r53v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r54v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r54v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r55v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r55v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r59v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r59v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r60v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r60v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r63v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r63v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r64v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r64v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r67v1 */
    /* JADX WARN: Type inference failed for: r68v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r69v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r70v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r71v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r72v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r75v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r76v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r78v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r79v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r80v0, types: [boolean] */
    private final List<C0FFO> W1() {
        C0FFO c0ffoLIZIZ;
        Pair<Float, Float> pairLIZ = C07LA.LIZ();
        ArrayList arrayList = new ArrayList();
        EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.DONATION;
        ArrayList arrayListLJ = C1697810uHb.LJ(3);
        Float fValueOf = Float.valueOf(0.2f);
        Float fValueOf2 = Float.valueOf(10.0f);
        arrayList.add(new C0FFO(enumC1466150oFx, 0, false, false, false, false, true, arrayListLJ, new Pair(fValueOf, fValueOf2), false, false, true, false, false, false, new C0FXE(6), 1816126));
        C0FFO c0ffo = new C0FFO(EnumC1466150oFx.AI_CAPTION_TAG, 0, false, false, false, false, false, null, null, false, false, true, false, false, false, new C0FXE(7), 1818562);
        C0FFO c0ffo2 = new C0FFO(EnumC1466150oFx.MUSIC_STICKER, 0, false, false, false, false, false, null, null, false, false, false, false, false, false, new C19774612Ym(26), 1830886);
        C0FFO c0ffo3 = new C0FFO(EnumC1466150oFx.MEME_SONG_TEXT, 0, false, false, false, false, false, null, null, false, true, false, false, false, false, new C0FXE(10), 1793990);
        C0FFO c0ffo4 = new C0FFO(EnumC1466150oFx.LYRIC_STICKER, 0, false, false, false, true, true, new ArrayList(), new Pair(fValueOf, fValueOf2), false, true, true, false, false, false, new C0FXE(9), 1771142);
        if (!C1428650nHT.LIZ()) {
            arrayList.add(C1403910mdZ.LIZIZ());
        }
        C0FFO c0ffo5 = new C0FFO(EnumC1466150oFx.LOCATION, 0, false, false, false, false, false, null, new Pair(Float.valueOf(0.6f), Float.valueOf(1.2f)), false, false, true, false, false, false, new C0FXE(8), 1812478);
        C0FFO c0ffo6 = new C0FFO(EnumC1466150oFx.TEXT, 0, true, true, true, (C1428470nHB.LJJLIIIJLLLLLLLZ(LJJJLIIL()) || LJJJLIIL().isEnterFromDM() || (C577360Mkg.LIZ() && LJJJLIIL().isEnterFromBulletin())) ? false : true, true, (C577360Mkg.LIZ() && LJJJLIIL().isEnterFromBulletin()) ? C1697810uHb.LJ(2) : C1697810uHb.LJ(4, 3, 2), new Pair(Float.valueOf(0.4f), Float.valueOf(11.0f)), true, C1416310mxZ.LJIJ(LJJJLIIL()), true, false, true, true, new C0FXE(11), 1050242);
        C0FFO c0ffo7 = new C0FFO(EnumC1466150oFx.INTERACTIVE_EMOJI, 0, false, false, false, false, true, C1697810uHb.LJ(3, 2), null, false, false, true, false, false, false, new C19774612Ym(24), 1818302);
        arrayList.add(C1403910mdZ.LIZIZ());
        C0FFO c0ffo8 = new C0FFO(EnumC1466150oFx.EMOJI_SLIDER, 0, false, false, true, false, true, C1697810uHb.LJ(3, 2), new Pair(Float.valueOf(0.6f), fValueOf2), false, false, true, false, false, false, new C19774612Ym(23), 1816238);
        arrayList.add(new C0FFO(EnumC1466150oFx.LINK, 0, false, false, false, false, false, null, new Pair(Float.valueOf(0.5f), Float.valueOf(3.0f)), false, false, false, true, false, false, new C19774612Ym(25), 1796078));
        IArticleStickerComponentService.LIZ.getClass();
        IArticleStickerComponentService value = C19607911nZ.LIZIZ.getValue();
        char c = 0;
        if (value != null) {
            C19774612Ym c19774612YmLIZIZ = value.LIZIZ();
            c = 0;
            if (c19774612YmLIZIZ != null) {
                c = 0;
                arrayList.add(new C0FFO(EnumC1466150oFx.ARTICLE, 0, false, false, false, false, true, C1697810uHb.LJ(3, 2), new Pair(Float.valueOf(0.75f), Float.valueOf(3.0f)), false, false, true, false, false, false, c19774612YmLIZIZ, 1816254));
            }
        }
        arrayList.add(c0ffo8);
        arrayList.add(c0ffo);
        EnumC1466150oFx enumC1466150oFx2 = EnumC1466150oFx.LIVE_COUNTDOWN;
        Pair pair = new Pair(fValueOf, fValueOf2);
        Integer[] numArr = new Integer[2];
        numArr[c] = 3;
        numArr[1] = 2;
        ?? r24 = c;
        arrayList.add(new C0FFO(enumC1466150oFx2, r24 == true ? 1 : 0, r24, r24, r24, r24, true, C1697810uHb.LJ(numArr), pair, r24, r24, true, r24, r24, r24, new C19774612Ym(16), 1816254));
        boolean z = r24 == true ? 1 : 0;
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(ILiveEventStickerService.class, z, z, true, 2, null);
        ?? r242 = z;
        if (objPluggableSpi$default != null) {
            InterfaceC19626511qZ interfaceC19626511qZZ4 = z4();
            boolean zXy1 = interfaceC19626511qZZ4 != null ? interfaceC19626511qZZ4.Xy1() : false;
            EnumC1466150oFx enumC1466150oFx3 = EnumC1466150oFx.LIVE_EVENT_COUNTDOWN;
            boolean z2 = !zXy1;
            Pair pair2 = new Pair(fValueOf, fValueOf2);
            Integer[] numArr2 = new Integer[2];
            numArr2[z ? 1 : 0] = 3;
            numArr2[1] = 2;
            ArrayList arrayListLJ2 = C1697810uHb.LJ(numArr2);
            C19774612Ym c19774612Ym = new C19774612Ym(17);
            boolean z3 = z ? 1 : 0;
            arrayList.add(new C0FFO(enumC1466150oFx3, z3 ? 1 : 0, z3, z3, z2, z3, z2, arrayListLJ2, pair2, z3, z3, true, z3, z3, z3, c19774612Ym, 1816238));
            r242 = z3;
        }
        arrayList.add(c0ffo3);
        arrayList.add(c0ffo4);
        arrayList.add(new C0FFO(EnumC1466150oFx.COMMENT, r242 == true ? 1 : 0, r242, r242, r242, r242, r242, Collections.singletonList(3), null, r242, r242, true, r242, r242, r242, new C19774612Ym(27), 1818366));
        arrayList.add(c0ffo5);
        arrayList.add(c0ffo2);
        EnumC1466150oFx enumC1466150oFx4 = EnumC1466150oFx.MENTION;
        Integer[] numArr3 = new Integer[2];
        numArr3[r242] = 3;
        numArr3[1] = 2;
        arrayList.add(new C0FFO(enumC1466150oFx4, r242 == true ? 1 : 0, r242, r242, r242, r242, true, C1697810uHb.LJ(numArr3), pairLIZ, r242, r242, true, true, r242, r242, new C19774612Ym(18), 1783486));
        EnumC1466150oFx enumC1466150oFx5 = EnumC1466150oFx.HASH_TAG;
        Integer[] numArr4 = new Integer[2];
        numArr4[r242] = 3;
        numArr4[1] = 2;
        arrayList.add(new C0FFO(enumC1466150oFx5, r242 == true ? 1 : 0, r242, r242, r242, r242, true, C1697810uHb.LJ(numArr4), pairLIZ, r242, r242, true, true, r242, r242, new C19774612Ym(19), 1783486));
        EnumC1466150oFx enumC1466150oFx6 = EnumC1466150oFx.POLL;
        Pair pair3 = new Pair(fValueOf, fValueOf2);
        Integer[] numArr5 = new Integer[2];
        numArr5[r242] = 3;
        numArr5[1] = 2;
        ?? r243 = r242;
        arrayList.add(new C0FFO(enumC1466150oFx6, r243 == true ? 1 : 0, r243, r243, r243, r243, true, C1697810uHb.LJ(numArr5), pair3, r243, r243, true, r243, r243, r243, new C19774612Ym(20), 1816254));
        arrayList.add(new C0FFO(EnumC1466150oFx.ATTRIBUTION_LINK, 1, r243, r243, r243, r243, r243, null, null, r243, r243, r243, r243, r243, r243, new C19774612Ym(21), 1834976));
        if (PluggableExtentionKt.pluggableSpi$default(ILiveShare.class, r243, r243, true, 2, null) != null) {
            arrayList.add(new C0FFO(EnumC1466150oFx.LIVE_SHARE, r243 == true ? 1 : 0, r243, r243, r243, r243, r243, null, null, r243, r243, r243, r243, r243, r243, new C19774612Ym(22), 1802114));
        }
        arrayList.add(c0ffo7);
        arrayList.add(c0ffo6);
        ISharedCommentStickerComponentProvider iSharedCommentStickerComponentProvider = (ISharedCommentStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ISharedCommentStickerComponentProvider.class, r243, r243, r243, 14, null);
        if (iSharedCommentStickerComponentProvider != null && (c0ffoLIZIZ = iSharedCommentStickerComponentProvider.LIZIZ()) != null) {
            arrayList.add(c0ffoLIZIZ);
        }
        arrayList.add(new C0FFO(EnumC1466150oFx.SECRET_REPLIES, 1, true, r243, r243, r243, true, null, new Pair(Float.valueOf(0.4f), Float.valueOf(3.0f)), r243, r243, r243, r243, r243, r243, new C19774612Ym(12), 1832872));
        EnumC1466150oFx enumC1466150oFx7 = EnumC1466150oFx.SECRET_REPLIES_RESPONSE;
        Pair pair4 = new Pair(Float.valueOf(0.4f), Float.valueOf(3.0f));
        Integer[] numArr6 = new Integer[1];
        numArr6[r243 == true ? 1 : 0] = 1;
        arrayList.add(new C0FFO(enumC1466150oFx7, 1, true, r243, r243, r243, r243, C1697810uHb.LJ(numArr6), pair4, r243, r243, r243, r243, r243, r243, new C19774612Ym(13), 1832696));
        EnumC1466150oFx enumC1466150oFx8 = EnumC1466150oFx.SOCIAL_AVATAR;
        Integer[] numArr7 = new Integer[1];
        numArr7[r243 == true ? 1 : 0] = 3;
        ArrayList arrayListLJ3 = C1697810uHb.LJ(numArr7);
        C19774612Ym c19774612Ym2 = new C19774612Ym(14);
        boolean z4 = r243 == true ? 1 : 0;
        arrayList.add(new C0FFO(enumC1466150oFx8, z4 ? 1 : 0, z4, z4, z4, z4, z4, arrayListLJ3, null, z4, z4, true, z4, z4, z4, c19774612Ym2, 1818366));
        Object objPluggableSpi$default2 = PluggableExtentionKt.pluggableSpi$default(ILiveEventStoryStickerService.class, z4, z4, true, 2, null);
        ?? r244 = z4;
        if (objPluggableSpi$default2 != null) {
            EnumC1466150oFx enumC1466150oFx9 = EnumC1466150oFx.LIVE_EVENT_STORY;
            C19774612Ym c19774612Ym3 = new C19774612Ym(15);
            boolean z5 = z4 ? 1 : 0;
            arrayList.add(new C0FFO(enumC1466150oFx9, z5 ? 1 : 0, z5, z5, z5, z5, z5, null, null, z5, z5, z5, z5, z5, z5, c19774612Ym3, 1802114));
            r244 = z5;
        }
        EnumC1466150oFx enumC1466150oFx10 = EnumC1466150oFx.DM_GROUP_CHAT;
        Pair pair5 = new Pair(Float.valueOf(0.6f), Float.valueOf(1.2f));
        Integer[] numArr8 = new Integer[3];
        numArr8[r244] = 3;
        numArr8[1] = 9;
        numArr8[2] = 10;
        arrayList.add(new C0FFO(enumC1466150oFx10, r244 == true ? 1 : 0, r244, r244, r244, r244, r244, C1697810uHb.LJ(numArr8), pair5, r244, r244, true, r244, r244, r244, new InterfaceC386720FEg() { // from class: X.11oD
            @Override // X.InterfaceC386720FEg
            public final AbstractC388880FMo LIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
                IGroupChatStickerApi iGroupChatStickerApi = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
                if (iGroupChatStickerApi != null) {
                    return iGroupChatStickerApi.LJII(context, frameLayout, frameLayout2, lifecycleOwner, c390420FSm, new AwS573S0100000_29(this.LIZ, 654));
                }
                return null;
            }
        }, 1816318));
        return arrayList;
    }

    private final void Z1() {
        InterfaceC1452170ntP interfaceC1452170ntPH4 = H4();
        if (interfaceC1452170ntPH4 != null) {
            int duration = interfaceC1452170ntPH4.getDuration();
            for (StickerModel stickerModel : C1466090oFr.LJFF(LJJJLIIL().creativeModel.stickerModel)) {
                float f = duration;
                if (Math.abs(stickerModel.getBaseModel().getEndTime() - f) < 20.0f) {
                    stickerModel.getBaseModel().setEndTime(f);
                }
            }
        }
    }

    private final int Z4() {
        return ((C497820Jfg.LIZ(C1664590tQ1.LJIIIZ(this)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(218))) - C497820Jfg.LIZJ(C1664590tQ1.LJIIIZ(this))) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(C1664590tQ1.LJII(this));
    }

    public final InterfaceC1452170ntP H4() {
        InterfaceC1452170ntP value = JY0().g().getValue();
        return value == null ? T4() : value;
    }

    @Override // X.InterfaceC391240FVq
    public void KN2() {
        VESize vESize;
        NowsExtra nowsExtra;
        InterfaceC1452170ntP interfaceC1452170ntPH4 = H4();
        if (interfaceC1452170ntPH4 == null || (vESize = interfaceC1452170ntPH4.getInitSize()) == null) {
            vESize = new VESize(720, 1080);
        }
        FrameLayout frameLayout = this.LLJILLL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C1675310thJ.LIZ(vESize.width, vESize.height, frameLayout);
        if (C1428470nHB.LJJLIIIJLLLLLLLZ(LJJJLIIL())) {
            FrameLayout frameLayout2 = this.LLJILLL;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            layoutParams.width = vESize.width;
            layoutParams.height = vESize.height;
        }
        NowsShootModel nowsShootModel = LJJJLIIL().creativeModel.nowsShootModel;
        if (nowsShootModel == null || (nowsExtra = nowsShootModel.nowsExtra) == null || nowsExtra.is9To16Ratio) {
            FrameLayout frameLayout3 = this.LLJILLL;
            C1447470nlp.LIZIZ(frameLayout3 != null ? frameLayout3 : null, C11VU.LIZ(20.0f));
        } else {
            FrameLayout frameLayout4 = this.LLJILLL;
            C1447470nlp.LIZIZ(frameLayout4 != null ? frameLayout4 : null, C11VU.LIZ(28.0f));
        }
        InterfaceC379580EuS interfaceC379580EuSV3 = v3();
        if (interfaceC379580EuSV3 != null) {
            interfaceC379580EuSV3.X51(vESize);
        }
    }

    public final C19647711tz k5() {
        String strLIZJ;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        UrlModel avatarThumb = currentUser != null ? currentUser.getAvatarThumb() : null;
        if (C0FEA.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            C1464900oDw c1464900oDw = C1464900oDw.LIZ;
            C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources = C1664590tQ1.LJIIIZ(this).getResources();
            c1464900oDw.getClass();
            sbLIZ.append(C1464900oDw.LIZJ(currentUser2, resources));
            strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C1464900oDw c1464900oDw2 = C1464900oDw.LIZ;
            C19292410dm currentUser3 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources2 = C1664590tQ1.LJIIIZ(this).getResources();
            c1464900oDw2.getClass();
            strLIZJ = C1464900oDw.LIZJ(currentUser3, resources2);
        }
        float f = C0FEA.LIZIZ() ? 17.0f : 15.0f;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        C1464900oDw c1464900oDw3 = C1464900oDw.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        C19292410dm currentUser4 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        c1464900oDw3.getClass();
        sbLIZ2.append(C1464900oDw.LIZ(contextLJIIIZ, currentUser4));
        return new C19647711tz(avatarThumb, strLIZJ != null ? strLIZJ : "", f, C2188811AlT.LIZIZ(sbLIZ2), 63);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1455850nzL interfaceC1455850nzLG2 = G2();
        if (interfaceC1455850nzLG2 != null) {
            interfaceC1455850nzLG2.Kx0(this);
        }
        n5();
        this.LLJLL = t5();
        if (this.LLILZLL.LJ() != null) {
            C385670FAf<InterfaceC1460000o62> c385670FAfLJ = this.LLILZLL.LJ();
            if (c385670FAfLJ != null) {
                c385670FAfLJ.LIZ(this, new AObjectS240S0100000_5(this, 39));
            }
        } else {
            LiveData<Integer> liveDataLIZ = this.LLILZLL.LIZ();
            if (liveDataLIZ != null) {
                liveDataLIZ.observe(this, new AObjectS240S0100000_5(this, 40));
            }
        }
        if (this.LLILZIL) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS584S0100000_5(this, 184));
        } else {
            c3().Pr0().observe(this, new AObjectS240S0100000_5(this, 42));
        }
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1414530muh.class, new AwS608S0100000_29(this, 369));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C0FW6 c0fw6LJIIIZ;
        super.onDestroy();
        InterfaceC1455850nzL interfaceC1455850nzLG2 = G2();
        if (interfaceC1455850nzLG2 != null) {
            interfaceC1455850nzLG2.Kx0(null);
        }
        InterfaceC1452170ntP interfaceC1452170ntP = K4().LLILZIL;
        if (interfaceC1452170ntP != null) {
            C2388309Xl.LIZ.getClass();
            String str = C2388309Xl.LIZIZ;
            if (str != null) {
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
                if (c348100DkmLIZIZ != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
                    c0fw6LJIIIZ.LJIILJJIL(str);
                }
                interfaceC1452170ntP.jg();
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        InterfaceC1452170ntP interfaceC1452170ntPH4;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        super.onPause();
        C0FG9.LIZ.getClass();
        if (!C0FG9.LIZ() || (interfaceC1452170ntPH4 = H4()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPH4)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null) {
            return;
        }
        nLEEditor.removeConsumer(this.LLLF);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        super.onResume();
        C0FG9.LIZ.getClass();
        if (C0FG9.LIZ()) {
            InterfaceC1452170ntP interfaceC1452170ntPH4 = H4();
            if (interfaceC1452170ntPH4 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPH4)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
                nLEEditor.addConsumer(this.LLLF);
            }
            FrameLayout frameLayout = this.LLJILLL;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.addOnLayoutChangeListener(new C12YD(this, 5));
        }
        if (((Number) C1402790mbl.LIZ.getValue()).intValue() != 0) {
            if (this.LLLFZ) {
                this.LLLFZ = false;
            } else if (this.LLLI) {
                this.LLLI = false;
            } else {
                mx2(false);
            }
        }
    }

    public final C0FVT q3() {
        return i3().kR();
    }

    public final void x5() {
        NLEModel nLEModelBf;
        InterfaceC1452170ntP interfaceC1452170ntPH4 = H4();
        if (interfaceC1452170ntPH4 == null || (nLEModelBf = interfaceC1452170ntPH4.bf(C365950EWj.LIZ())) == null) {
            return;
        }
        C1524705y1.LIZ(new AwS406S0200000_5(nLEModelBf, this, 28));
    }

    @Override // X.InterfaceC391240FVq
    public LiveEvent<Boolean> Gm1() {
        return this.LLLIIII;
    }

    public final GestureInteractItem H3() {
        return this.LLLIIIIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC391240FVq
    public void HL2(Function0<Unit> function0) {
        if (this.LLLFFI) {
            function0.invoke();
        } else {
            this.LLLFF.add(new RunnableC514801zW(function0, (Function0<Unit>) 77));
        }
    }

    @Override // X.InterfaceC391240FVq
    public void LJJZZI(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            c0ft7.LJJZZI(c0ftb);
        }
    }

    @Override // X.InterfaceC391240FVq
    public void LJLLLL(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            c0ft7.LJLLLL(c0ftb);
        }
    }

    @Override // X.InterfaceC391240FVq
    public <T> T LLIIIZ(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            return null;
        }
        return (T) c0ft7.LLIIIZ(enumC1466150oFx);
    }

    @Override // X.InterfaceC391240FVq
    public StickerModel LLJJIJI(int i) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.LLJJIJI(i);
    }

    @Override // X.InterfaceC391240FVq
    public List<StickerModel> LLLILZLLLI(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.LJIIIZ(enumC1466150oFx);
    }

    @Override // X.InterfaceC391240FVq
    public List<C0FTJ<StickerModel>> LLLLLZ(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            return c0ft7.LLLLLZ(enumC1466150oFx);
        }
        return C13BV.INSTANCE;
    }

    public final void X1(boolean z) {
        if (z) {
            C1456140nzo.LIZIZ(JY0(), true, false, true, false, 8);
            InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
            int iLIZ = C960203pA.LIZ(R.attr.e1, C1664590tQ1.LJIIIZ(this));
            int iLIZJ = C497820Jfg.LIZJ(C1664590tQ1.LJIIIZ(this)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(218));
            int iZ4 = Z4();
            c0.LIZ.n2();
            interfaceC1446740nkeJY0.aM0(C1453170nv1.LIZ(iLIZ, iLIZJ, iLIZIZ, iZ4));
            return;
        }
        C1456140nzo.LIZIZ(JY0(), false, false, false, false, 8);
        InterfaceC1446740nke interfaceC1446740nkeJY02 = JY0();
        int iLIZIZ2 = C19733712It.LIZIZ(true, false, false, false);
        int iLIZJ2 = C497820Jfg.LIZJ(C1664590tQ1.LJIIIZ(this)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(218));
        int iZ42 = Z4();
        c0.LIZ.n2();
        interfaceC1446740nkeJY02.aM0(C1453170nv1.LIZIZ(iLIZIZ2, iLIZJ2, iLIZIZ3, iZ42, false, false, 1984));
        InterfaceC1452170ntP interfaceC1452170ntPH4 = H4();
        if (interfaceC1452170ntPH4 == null) {
            return;
        }
        interfaceC1452170ntPH4.setLoopPlay(true);
    }

    @Override // X.InterfaceC391240FVq
    public void aR(float f) {
        C786410Ut5.U4(this.LLILLL, f);
    }

    @Override // X.InterfaceC391240FVq
    public void ab(boolean z) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.ab(z);
    }

    @Override // X.InterfaceC391240FVq
    public void h12(StickerModel stickerModel) {
        if (this.LLJLL == null) {
            return;
        }
        if (stickerModel.isNotEmptyModel()) {
            C1466090oFr.LIZIZ(LJJJLIIL().creativeModel.stickerModel, stickerModel);
        } else {
            C1466090oFr.LIZJ(LJJJLIIL().creativeModel.stickerModel, stickerModel);
        }
    }

    @Override // X.InterfaceC391240FVq
    public void mx2(boolean z) {
        if (((Number) C1402790mbl.LIZ.getValue()).intValue() != 0) {
            AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) C13LP.LJJJLL(LJJJLIIL().creativeModel.stickerModel.addYoursStickerModels);
            C0FT7 c0ft7 = null;
            if (addYoursStickerModel == null) {
                C0FT7 c0ft72 = this.LLJLL;
                if (c0ft72 != null) {
                    c0ft7 = c0ft72;
                }
                c0ft7.LJII(EnumC1466150oFx.ADD_YOURS);
            } else {
                C0FT7 c0ft73 = this.LLJLL;
                if (c0ft73 == null) {
                    c0ft73 = null;
                }
                EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.ADD_YOURS;
                List<StickerModel> listLJIIIZ = c0ft73.LJIIIZ(enumC1466150oFx);
                if (listLJIIIZ.isEmpty()) {
                    C0FT7 c0ft74 = this.LLJLL;
                    if (c0ft74 != null) {
                        c0ft7 = c0ft74;
                    }
                    c0ft7.f3(addYoursStickerModel, EnumC356070Dxd.COMMIT);
                } else {
                    StickerModel stickerModel = (StickerModel) C13LP.LJJJLL(listLJIIIZ);
                    if (stickerModel != null && stickerModel.getId() == addYoursStickerModel.getId()) {
                        C0FT7 c0ft75 = this.LLJLL;
                        if (c0ft75 != null) {
                            c0ft7 = c0ft75;
                        }
                        c0ft7.LIZ(addYoursStickerModel);
                    } else {
                        C0FT7 c0ft76 = this.LLJLL;
                        if (c0ft76 == null) {
                            c0ft76 = null;
                        }
                        c0ft76.LJII(enumC1466150oFx);
                        C0FT7 c0ft77 = this.LLJLL;
                        if (c0ft77 != null) {
                            c0ft7 = c0ft77;
                        }
                        c0ft7.f3(addYoursStickerModel, EnumC356070Dxd.COMMIT);
                    }
                }
            }
            if (z) {
                this.LLLI = true;
            }
        }
    }

    @Override // X.InterfaceC391240FVq
    public void pm(C390500FSu c390500FSu) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.pm(c390500FSu);
    }

    @Override // X.InterfaceC391240FVq
    public void sS(StickerModel stickerModel) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJIIIIZZ(stickerModel.getId());
    }

    @Override // X.InterfaceC391240FVq
    public C0FTJ<StickerModel> tq(int i) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            return null;
        }
        return c0ft7.tq(i);
    }

    public final void v5(GestureInteractItem gestureInteractItem) {
        this.LLLIIIIL = gestureInteractItem;
    }

    @Override // X.InterfaceC391240FVq
    public void xm2(boolean z) {
        C0FT7 c0ft7 = null;
        if (z) {
            if (this.LLLIIIIL != null) {
                return;
            }
            C0FT7 c0ft72 = this.LLJLL;
            if (c0ft72 != null) {
                c0ft7 = c0ft72;
            }
            GestureInteractItem gestureInteractItem = new GestureInteractItem(550, c0ft7.ac());
            this.LLLIIIIL = gestureInteractItem;
            O3().LIZIZ(gestureInteractItem);
            return;
        }
        GestureInteractItem gestureInteractItem2 = this.LLLIIIIL;
        if (gestureInteractItem2 != null) {
            O3().LIZ(gestureInteractItem2);
            this.LLLIIIIL = null;
        }
    }

    @Override // X.InterfaceC391240FVq
    public Pair<Float, Float> y42(RectF rectF) {
        C0FG9.LIZ.getClass();
        if (C0FG9.LIZ()) {
            C0FT7 c0ft7 = this.LLJLL;
            if (c0ft7 == null) {
                c0ft7 = null;
            }
            return c0ft7.Ja().LJII().LIZIZ(rectF, false);
        }
        return new Pair<>(Float.valueOf(0.0f), Float.valueOf(1.0f));
    }

    @Override // X.InterfaceC391240FVq
    public void Gk(int i, C0FUG c0fug) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.Gk(i, c0fug);
    }

    @Override // X.InterfaceC391240FVq
    public void JF2(Pair<Integer, Integer> pair, EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null && this.LLLFFI) {
            List<StickerModel> listLIZLLL = c0ft7.LIZLLL();
            if (enumC1466150oFx == null) {
                C1466090oFr.LJ(LJJJLIIL().creativeModel.stickerModel);
            } else {
                ArrayList arrayList = new ArrayList();
                for (StickerModel stickerModel : listLIZLLL) {
                    if (stickerModel.getStickerType() == enumC1466150oFx) {
                        arrayList.add(stickerModel);
                    }
                }
                C1466090oFr.LIZLLL(LJJJLIIL().creativeModel.stickerModel, enumC1466150oFx);
                listLIZLLL = arrayList;
            }
            Iterator<StickerModel> it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                StickerModel next = it2.next();
                if (pair != null) {
                    next = next.updateMediaSize(pair);
                }
                if (!(next instanceof AddYoursStickerModel) || ((AddYoursStickerModel) next).isNotEmptyModel()) {
                    C1466090oFr.LIZIZ(LJJJLIIL().creativeModel.stickerModel, next);
                }
            }
            if (C1428470nHB.LLIIIJ(LJJJLIIL())) {
                String str = null;
                if (C0C64.LJIILLIIL().LJIJ(-1, 0, "text_mode_fill_desc_from_image_text", true) != 0) {
                    List<TextStickerModel> list = LJJJLIIL().creativeModel.stickerModel.textStickerModels;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<TextStickerModel> it3 = list.iterator();
                    while (it3.hasNext()) {
                        String string = a0.LJLIIIL(it3.next().getTextStr()).toString();
                        if (string.length() != 0) {
                            arrayList2.add(string);
                        }
                    }
                    PostPageModel postPageModel = LJJJLIIL().creativeModel.postPageModel;
                    String string2 = a0.LJLIIIL(C13LP.LJJLIIIJ(arrayList2, "\n", null, null, 0, null, null, 62)).toString();
                    if (string2.length() > 0) {
                        str = string2;
                    }
                    postPageModel.textModeDescCandidate = str;
                    return;
                }
                LJJJLIIL().creativeModel.postPageModel.textModeDescCandidate = null;
            }
        }
    }

    @Override // X.InterfaceC391240FVq
    public void T(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.T(list, enumC356070Dxd);
    }

    @Override // X.InterfaceC391240FVq
    public void cj2(int i, C0FSX c0fsx) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            c0ft7.Ja().LJIIL(i, c0fsx);
        }
    }

    @Override // X.InterfaceC391240FVq
    public StickerModel f3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.f3(stickerModel, enumC356070Dxd);
    }

    @Override // X.InterfaceC391240FVq
    public void k3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.k3(stickerModel, enumC356070Dxd);
    }

    @Override // X.InterfaceC391240FVq
    public void kT1(int i, int i2) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            c0ft7.Ja().LIZJ(i, i2);
        }
    }

    @Override // X.InterfaceC391240FVq
    public void lm(int i, List<? extends Function1<? super StickerModel, Unit>> list) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJIIJJI(i);
    }

    @Override // X.InterfaceC391240FVq
    public void ql(int i, C0FUD c0fud) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.ql(i, c0fud);
    }

    @Override // X.InterfaceC391240FVq
    public void rd(int i, EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.rd(i, enumC1466150oFx);
        JF2(null, enumC1466150oFx);
    }

    @Override // X.InterfaceC391240FVq
    public List<StickerModel> w3(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.w3(list, enumC356070Dxd);
    }

    @Override // X.InterfaceC391240FVq
    public void M3(List<Integer> list, String str, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.M3(list, str, enumC356070Dxd);
    }

    @Override // X.InterfaceC391240FVq
    public void XJ(int i, String str, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJIIJ(i, str, true, enumC356070Dxd);
    }

    @Override // X.InterfaceC391240FVq
    public void Tn0(EnumC1466150oFx enumC1466150oFx, C0FTJ<? extends StickerModel> c0ftj, String str, Function1<? super StickerModel, Unit> function1) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LIZIZ(enumC1466150oFx, c0ftj, null, str, function1);
    }

    @Override // X.InterfaceC391240FVq
    public void Ne(EnumC1466150oFx enumC1466150oFx, List<? extends StickerModel> list, String str, Function0<Unit> function0, Function0<Unit> function02) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            c0ft7.Ne(enumC1466150oFx, list, str, function0, function02);
        }
    }

    public C19625811qS(C1DRG c1drg, Scene scene, FrameLayout frameLayout, FrameLayout frameLayout2, boolean z, InterfaceC1462140o9U interfaceC1462140o9U) {
        this.LL = c1drg;
        this.LLILLJJLI = scene;
        this.LLILLL = frameLayout;
        this.LLILZ = frameLayout2;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC1462140o9U;
        C560530Lyd<Boolean> c560530Lyd = new C560530Lyd<>();
        this.LLLII = c560530Lyd;
        this.LLLIIII = c560530Lyd;
        this.LLLIIIL = new Pair<>(0, 0);
    }

    @Override // X.InterfaceC391240FVq
    public void LLILII(boolean z, String str, int i, C0FSX c0fsx, Integer num, Integer num2, Integer num3, Integer num4, C0FSZ c0fsz) {
        C0FT7 c0ft7 = this.LLJLL;
        if (c0ft7 != null) {
            c0ft7.Ja().LLILII(z, str, i, c0fsx, num, num2, num3, num4, c0fsz);
        }
    }
}
