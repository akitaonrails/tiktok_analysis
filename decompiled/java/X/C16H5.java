package X;

import com.bytedance.ies.xelement.LynxAudio;
import com.bytedance.ies.xelement.LynxVideoManagerLite;
import com.bytedance.ies.xelement.audiott.LynxAudioTTView;
import com.bytedance.ies.xelement.picker.LynxPickerView;
import com.bytedance.ies.xelement.video.pro.LynxVideoUI;
import com.bytedance.ies.xelement.webview.api.LynxWebView;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.base.xelements.xvideo.LynxUgVideoUI;
import j27.s;

/* JADX INFO: renamed from: X.16H5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H5 extends C1311670kEn {
    public final int $t;

    @Override // X.C1311670kEn
    public final LynxUI LJFF(s sVar) {
        switch (this.$t) {
            case 6:
                return LJFF$0(this, sVar);
            case 7:
                return LJFF$1(this, sVar);
            case 8:
                return LJFF$2(this, sVar);
            default:
                return super.LJFF(sVar);
        }
    }

    @Override // X.C1311670kEn
    public final LynxUI LJI(s sVar, Object obj) {
        switch (this.$t) {
            case 0:
                return LJI$0(this, sVar, obj);
            case 1:
                return LJI$1(this, sVar, obj);
            case 2:
                return LJI$2(this, sVar, obj);
            case 3:
                return LJI$3(this, sVar, obj);
            case 4:
                return LJI$4(this, sVar, obj);
            case 5:
                return LJI$5(this, sVar, obj);
            default:
                return super.LJI(sVar, obj);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C16H5(int r6) {
        /*
            r5 = this;
            r5.$t = r6
            switch(r6) {
                case 0: goto L40;
                case 1: goto L39;
                case 2: goto L32;
                case 3: goto L2b;
                case 4: goto L24;
                case 5: goto L1d;
                case 6: goto L16;
                case 7: goto Lf;
                default: goto L5;
            }
        L5:
            r0 = r5
            r4 = 0
            java.lang.String r3 = "x-audio-tt"
            r1 = r4
            r2 = r4
        Lb:
            r0.<init>(r3, r4, r1, r2)
            return
        Lf:
            r0 = r5
            r4 = 0
            java.lang.String r3 = "search-x-webview"
            r1 = r4
            r2 = r4
            goto Lb
        L16:
            r0 = r5
            java.lang.String r3 = "x-video-pro-ug"
            r4 = 0
            r1 = r4
            r2 = r4
            goto Lb
        L1d:
            r0 = r5
            java.lang.String r3 = "x-webview"
            r4 = 0
            r1 = r4
            r2 = r4
            goto Lb
        L24:
            r0 = r5
            java.lang.String r3 = "x-video-pro"
            r4 = 0
            r1 = r4
            r2 = r4
            goto Lb
        L2b:
            r0 = r5
            java.lang.String r3 = "x-video"
            r4 = 0
            r1 = r4
            r2 = r4
            goto Lb
        L32:
            r0 = r5
            r4 = 0
            r1 = 1
            java.lang.String r3 = "x-picker"
            r2 = r4
            goto Lb
        L39:
            r0 = r5
            java.lang.String r3 = "x-audio-tt"
            r4 = 0
            r1 = r4
            r2 = r4
            goto Lb
        L40:
            r0 = r5
            java.lang.String r3 = "x-audio"
            r4 = 0
            r1 = r4
            r2 = r4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16H5.<init>(int):void");
    }

    public static final LynxUI LJFF$0(C16H5 c16h5, s sVar) {
        return new LynxUgVideoUI(sVar);
    }

    public static final LynxUI LJFF$1(C16H5 c16h5, s sVar) {
        LynxWebView lynxWebView = new LynxWebView(sVar);
        C14BH c14bh = new C14BH();
        c14bh.LIZIZ.put("search", new C844230X9x(sVar));
        lynxWebView.setProvider(c14bh);
        return lynxWebView;
    }

    public static final LynxUI LJFF$2(C16H5 c16h5, s sVar) {
        LynxAudioTTView lynxAudioTTView = new LynxAudioTTView(sVar, null);
        C2178091AMd c2178091AMd = new C2178091AMd(sVar, new C1547950qNt(sVar, (EnumC1533980q1M) null, 6));
        C1AMZ c1amz = lynxAudioTTView.LL;
        if (c1amz != null) {
            c1amz.LLJI = c2178091AMd;
        }
        return lynxAudioTTView;
    }

    public static final LynxUI LJI$0(C16H5 c16h5, s sVar, Object obj) {
        return new LynxAudio(sVar, obj);
    }

    public static final LynxUI LJI$1(C16H5 c16h5, s sVar, Object obj) {
        return new LynxAudioTTView(sVar, obj);
    }

    public static final LynxUI LJI$2(C16H5 c16h5, s sVar, Object obj) {
        return new LynxPickerView(sVar, obj);
    }

    public static final LynxUI LJI$3(C16H5 c16h5, s sVar, Object obj) {
        return new LynxVideoManagerLite(sVar, obj);
    }

    public static final LynxUI LJI$4(C16H5 c16h5, s sVar, Object obj) {
        return new LynxVideoUI(sVar, obj);
    }

    public static final LynxUI LJI$5(C16H5 c16h5, s sVar, Object obj) {
        return new LynxWebView(sVar, obj);
    }
}
