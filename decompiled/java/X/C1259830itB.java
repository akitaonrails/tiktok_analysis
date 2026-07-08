package X;

import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0itB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259830itB extends AbstractC1260080ita {
    public final View LLIZ;
    public final int LLIZLLLIL;
    public final Activity LLJ;
    public C366690EZf LLJI;
    public TuxTextView LLJIJIL;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        Bitmap bitmapDecodeFile;
        Video video;
        UrlModel cover;
        List<String> urlList;
        PublishPreviewInfo previewData;
        Aweme aweme = this.LL;
        int i = (aweme == null || (previewData = AwemeBizExtKt.getPreviewData(aweme)) == null) ? 0 : previewData.progress;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishPreviewViewHolder -> updateCover -> progress = ");
        sbLIZ.append(i);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C366690EZf c366690EZf = this.LLJI;
        String str = null;
        if (c366690EZf == null) {
            c366690EZf = null;
        }
        c366690EZf.setProgress(i / 100.0f);
        TuxTextView tuxTextView = this.LLJIJIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append('%');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ2));
        Aweme aweme2 = this.LL;
        if (aweme2 != null && (video = aweme2.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null) {
            str = urlList.size() > 0 ? (String) ListProtector.get(urlList, 0) : "";
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("PublishPreviewViewHolder -> updateCover -> coverPath = ");
        sbLIZ3.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        if (!C123100dR.LIZ(str) || (bitmapDecodeFile = BitmapFactory.decodeFile(str)) == null) {
            return;
        }
        C786410Ut5.LLFF(0, this.LLILLJJLI);
        this.LLILLJJLI.setImageBitmap(bitmapDecodeFile);
    }

    public C1259830itB(View view, int i, C19EG c19eg, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = view;
        this.LLIZLLLIL = i;
        this.LLJ = c19eg;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.cover);
        this.LLJI = (C366690EZf) view.findViewById(R.id.tss);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.s9w);
        this.LLJIJIL = tuxTextView;
        (tuxTextView == null ? null : tuxTextView).setTextColorRes(R.attr.ee);
        C366690EZf c366690EZf = this.LLJI;
        c366690EZf = c366690EZf == null ? null : c366690EZf;
        Integer numLIZ = C1308910kAL.LIZ(R.attr.eh, c19eg);
        if (numLIZ != null) {
            c366690EZf.setBgColor(numLIZ.intValue());
            C366690EZf c366690EZf2 = this.LLJI;
            C366690EZf c366690EZf3 = c366690EZf2 != null ? c366690EZf2 : null;
            Integer numLIZ2 = C1308910kAL.LIZ(R.attr.ee, c19eg);
            if (numLIZ2 != null) {
                c366690EZf3.setProgressColor(numLIZ2.intValue());
                C786410Ut5.Q8(this.LLILLJJLI, new ACListenerS154S0100000_19(this, 239));
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
