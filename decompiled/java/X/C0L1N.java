package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0L1N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1N {
    public final ShortVideoContext LIZ;

    public C0L1N(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    public final void LIZ(C0L1O c0l1o) {
        String str = "";
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            String str2 = "photo";
            if (c0l1o.LIZIZ.equals("photo")) {
                ShortVideoContext shortVideoContext = this.LIZ;
                Pair[] pairArr = new Pair[8];
                pairArr[0] = new Pair("picture_source", "upload");
                pairArr[1] = new Pair("prop_id", c0l1o.LIZ.getEffectId());
                pairArr[2] = new Pair("click_content", c0l1o.LIZIZ);
                String str3 = c0l1o.LIZLLL;
                if (str3 == null) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[3] = new Pair("photo_cnt", str3);
                pairArr[4] = new Pair("content_type", c0l1o.LJFF);
                pairArr[5] = new Pair("selected_index", String.valueOf(c0l1o.LJI));
                pairArr[6] = new Pair("prop_resource_id", c0l1o.LIZ.getResourceId());
                pairArr[7] = new Pair("effect_source", String.valueOf(c0l1o.LIZ.getSource()));
                HashMap<String, String> mapLIZ = C1449260noi.LIZ(shortVideoContext, pairArr);
                C0LXN c0lxn = C0LXN.LIZ;
                Effect effect = c0l1o.LIZ;
                c0lxn.getClass();
                C0LXN.LIZ(effect, mapLIZ);
                C1449260noi.LJ("prop_customized_click", mapLIZ);
                return;
            }
            ShortVideoContext shortVideoContext2 = this.LIZ;
            Pair[] pairArr2 = new Pair[6];
            pairArr2[0] = new Pair("prop_id", c0l1o.LIZ.getEffectId());
            pairArr2[1] = new Pair("click_content", c0l1o.LIZIZ);
            String str4 = c0l1o.LIZLLL;
            if (str4 == null) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr2[2] = new Pair("photo_cnt", str4);
            String str5 = c0l1o.LIZJ;
            if (str5 != null) {
                str = str5;
            }
            pairArr2[3] = new Pair("video_source", str);
            if (!this.LIZ.isStoryOrPhotoTab) {
                str2 = "video";
            }
            pairArr2[4] = new Pair("content_type", str2);
            pairArr2[5] = new Pair("selected_index", String.valueOf(c0l1o.LJI));
            HashMap<String, String> mapLIZ2 = C1449260noi.LIZ(shortVideoContext2, pairArr2);
            C0LXN c0lxn2 = C0LXN.LIZ;
            Effect effect2 = c0l1o.LIZ;
            c0lxn2.getClass();
            C0LXN.LIZ(effect2, mapLIZ2);
            C1449260noi.LJ("prop_customized_click", mapLIZ2);
            return;
        }
        if (C522610KeZ.LIZ()) {
            ShortVideoContext shortVideoContext3 = this.LIZ;
            Pair[] pairArr3 = new Pair[5];
            pairArr3[0] = new Pair("picture_source", "upload");
            pairArr3[1] = new Pair("prop_id", c0l1o.LIZ.getEffectId());
            pairArr3[2] = new Pair("click_content", c0l1o.LIZIZ);
            String str6 = c0l1o.LIZJ;
            if (str6 != null) {
                str = str6;
            }
            pairArr3[3] = new Pair("video_source", str);
            pairArr3[4] = new Pair("selected_index", String.valueOf(c0l1o.LJI));
            C1449260noi.LJ("prop_customized_click", C1449260noi.LIZ(shortVideoContext3, pairArr3));
            return;
        }
        ShortVideoContext shortVideoContext4 = this.LIZ;
        Pair[] pairArr4 = new Pair[4];
        pairArr4[0] = new Pair("picture_source", "upload");
        pairArr4[1] = new Pair("prop_id", c0l1o.LIZ.getEffectId());
        pairArr4[2] = new Pair("click_content", c0l1o.LIZIZ);
        String str7 = c0l1o.LIZJ;
        if (str7 != null) {
            str = str7;
        }
        pairArr4[3] = new Pair("video_source", str);
        C1449260noi.LJ("prop_customized_click", C1449260noi.LIZ(shortVideoContext4, pairArr4));
    }
}
