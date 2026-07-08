package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0HmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C451030HmP {
    public int LIZ;
    public String LIZIZ;
    public Emoji LIZJ;
    public Integer LIZLLL;
    public SetSticker LJ;
    public VideoSticker LJFF;
    public IMGiphyInfo LJI;
    public CommentPersonalizedEmoji LJII;
    public Boolean LJIIIIZZ = Boolean.FALSE;

    public String LIZ() {
        Long stickerId;
        Long videoStickerId;
        VideoSticker videoSticker = this.LJFF;
        if (videoSticker != null && (videoStickerId = videoSticker.getVideoStickerId()) != null) {
            return videoStickerId.toString();
        }
        SetSticker setSticker = this.LJ;
        if (setSticker != null && (stickerId = setSticker.getStickerId()) != null) {
            return stickerId.toString();
        }
        IMGiphyInfo iMGiphyInfo = this.LJI;
        if (iMGiphyInfo != null) {
            return iMGiphyInfo.getId();
        }
        return null;
    }

    public UrlModel LIZJ() {
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel urlModel3;
        UrlModel urlModel4;
        VideoSticker videoSticker = this.LJFF;
        if (videoSticker != null) {
            StickerUrlStruct animateUrl = videoSticker.getAnimateUrl();
            if (animateUrl != null && (urlModel4 = animateUrl.midResolutionUrl) != null && urlModel4.getUrlList() != null && !urlModel4.getUrlList().isEmpty()) {
                return urlModel4;
            }
            StickerUrlStruct staticUrl = this.LJFF.getStaticUrl();
            if (staticUrl != null && (urlModel3 = staticUrl.midResolutionUrl) != null && urlModel3.getUrlList() != null && !urlModel3.getUrlList().isEmpty()) {
                return urlModel3;
            }
        }
        SetSticker setSticker = this.LJ;
        if (setSticker != null) {
            StickerUrlStruct animateUrl2 = setSticker.getAnimateUrl();
            if (animateUrl2 != null && (urlModel2 = animateUrl2.midResolutionUrl) != null && urlModel2.getUrlList() != null && !urlModel2.getUrlList().isEmpty()) {
                return urlModel2;
            }
            StickerUrlStruct staticUrl2 = this.LJ.getStaticUrl();
            if (staticUrl2 != null && (urlModel = staticUrl2.midResolutionUrl) != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
                return urlModel;
            }
        }
        if (this.LJI == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LJI.getUrl());
        UrlModel urlModel5 = new UrlModel();
        urlModel5.setUrlList(arrayList);
        Integer width = this.LJI.getWidth();
        Integer height = this.LJI.getHeight();
        if (width != null) {
            urlModel5.setWidth(width.intValue());
        }
        if (height != null) {
            urlModel5.setHeight(height.intValue());
        }
        return urlModel5;
    }

    public final boolean LIZLLL() {
        return this.LIZJ != null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Integer LIZIZ() {
        return this.LIZLLL;
    }

    public boolean equals(Object obj) {
        Emoji emoji;
        if (!(obj instanceof C451030HmP)) {
            return false;
        }
        C451030HmP c451030HmP = (C451030HmP) obj;
        if (((c451030HmP.LIZ <= 0 && TextUtils.isEmpty(null)) || c451030HmP.LIZ != this.LIZ || !TextUtils.equals(null, null) || !TextUtils.equals(c451030HmP.LIZIZ, this.LIZIZ)) && ((emoji = c451030HmP.LIZJ) == null || !emoji.equals(this.LIZJ))) {
            return false;
        }
        return true;
    }
}
