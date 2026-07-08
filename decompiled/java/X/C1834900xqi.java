package X;

import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.CaptionPositionLocal;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditParams;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.EditRenderElementsLocal;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.MusicLocal;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.TextStickerConfigLocal;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostApi;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.CaptionPosition;
import tikcast.api.anchor.EditParam;
import tikcast.api.anchor.EditRenderElements;
import tikcast.api.anchor.HashTag;
import tikcast.api.anchor.Music;
import tikcast.api.anchor.PostLiveFragmentReq;
import tikcast.api.anchor.PostLiveFragmentResp;

/* JADX INFO: renamed from: X.0xqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834900xqi implements InterfaceC149400hg {
    public final /* synthetic */ C1813760xIc LL;

    public C1834900xqi(C1813760xIc c1813760xIc) {
        this.LL = c1813760xIc;
    }

    public final Object LJLZ(String str, String str2, int i, List<HashTag> list, String str3, EditParams editParams, int i2, InterfaceC1364105Vn<? super C470590Icr<PostLiveFragmentResp.ResponseData>> interfaceC1364105Vn) {
        Music music;
        TextStickerConfig textStickerConfig;
        PostLiveFragmentReq postLiveFragmentReq = new PostLiveFragmentReq();
        postLiveFragmentReq.title = str2;
        postLiveFragmentReq.fragmentId = str;
        postLiveFragmentReq.privateStatus = i;
        if (list == null) {
            list = new ArrayList<>();
        }
        postLiveFragmentReq.hashTagList = list;
        if (str3 == null) {
            str3 = "";
        }
        postLiveFragmentReq.userIdentity = str3;
        postLiveFragmentReq.postByScene = i2;
        if (editParams != null) {
            EditParam editParam = new EditParam();
            editParam.startTime = editParams.startTime;
            editParam.endTime = editParams.endTime;
            EditRenderElementsLocal editRenderElementsLocal = editParams.renderElements;
            EditRenderElements editRenderElements = null;
            CaptionPosition captionPosition = null;
            if (editRenderElementsLocal != null) {
                EditRenderElements editRenderElements2 = new EditRenderElements();
                editRenderElements2.originVideoVolume = editRenderElementsLocal.originVideoVolume;
                MusicLocal musicLocal = editRenderElementsLocal.music;
                if (musicLocal != null) {
                    music = new Music();
                    music.musicId = musicLocal.getMusicId();
                    music.previewUrl = musicLocal.getPreviewUrl();
                    music.volume = musicLocal.getVolume();
                    music.duration = musicLocal.getDuration();
                    music.loop = musicLocal.getLoop();
                } else {
                    music = null;
                }
                editRenderElements2.music = music;
                TextStickerConfigLocal textStickerConfigLocal = editRenderElementsLocal.subTitleLocal;
                if (textStickerConfigLocal != null) {
                    textStickerConfig = new TextStickerConfig();
                    textStickerConfig.centerX = textStickerConfigLocal.getCenterX();
                    textStickerConfig.centerY = textStickerConfigLocal.getCenterY();
                    textStickerConfig.text = textStickerConfigLocal.getText();
                } else {
                    textStickerConfig = null;
                }
                editRenderElements2.subTitle = textStickerConfig;
                CaptionPositionLocal captionPositionLocal = editRenderElementsLocal.captionPositionLocal;
                if (captionPositionLocal != null) {
                    captionPosition = new CaptionPosition();
                    captionPosition.centerX = captionPositionLocal.getCenterX();
                    captionPosition.centerY = captionPositionLocal.getCenterY();
                }
                editRenderElements2.captionPosition = captionPosition;
                editRenderElements = editRenderElements2;
            }
            editParam.renderElements = editRenderElements;
            postLiveFragmentReq.editParam = editParam;
        }
        return ((LiveQuickPostApi) this.LL.LL.getValue()).postAutoCut(postLiveFragmentReq, interfaceC1364105Vn);
    }
}
