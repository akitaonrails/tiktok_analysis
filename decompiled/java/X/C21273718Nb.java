package X;

import Y.ARunnableS75S0200000_6;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ECAnchorInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS86S0500000_32;

/* JADX INFO: renamed from: X.18Nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21273718Nb {
    public static final C21273718Nb LIZ = new C21273718Nb();
    public static final int LIZIZ = C0H9H.LIZIZ(10);
    public static AnonymousClass0956 LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:2:0x0000, B:7:0x0016, B:9:0x001c, B:11:0x0022, B:13:0x0028, B:15:0x002e, B:17:0x003d, B:19:0x0041, B:20:0x004b, B:25:0x005f, B:36:0x009d, B:23:0x0054, B:29:0x0065, B:30:0x0068, B:31:0x0076, B:33:0x0087, B:35:0x008b, B:38:0x00a3, B:40:0x00a9, B:42:0x00af, B:44:0x00b5, B:46:0x00bb, B:48:0x00ca, B:50:0x00ce, B:51:0x00d8, B:56:0x00ec, B:54:0x00e1, B:60:0x00f2, B:61:0x00f5), top: B:69:0x0000, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5 A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0103, blocks: (B:2:0x0000, B:7:0x0016, B:9:0x001c, B:11:0x0022, B:13:0x0028, B:15:0x002e, B:17:0x003d, B:19:0x0041, B:20:0x004b, B:25:0x005f, B:36:0x009d, B:23:0x0054, B:29:0x0065, B:30:0x0068, B:31:0x0076, B:33:0x0087, B:35:0x008b, B:38:0x00a3, B:40:0x00a9, B:42:0x00af, B:44:0x00b5, B:46:0x00bb, B:48:0x00ca, B:50:0x00ce, B:51:0x00d8, B:56:0x00ec, B:54:0x00e1, B:60:0x00f2, B:61:0x00f5), top: B:69:0x0000, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.ECAnchorInfo LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r10) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21273718Nb.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.ECAnchorInfo");
    }

    public static void LIZIZ(List list, final AbstractC21274918Nn abstractC21274918Nn, final Function1 function1, final Function0 function0, final Function0 function02) {
        final SpannableString spannableString = new SpannableString(" ");
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        C03IT c03it = new C03IT(list);
        c1326790kdB.getClass();
        C1326790kdB.LIZLLL(c03it).LJJII(new AbstractC468201s0() { // from class: X.0GcS
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap != null) {
                    AbstractC21274918Nn abstractC21274918Nn2 = abstractC21274918Nn;
                    SpannableString spannableString2 = spannableString;
                    Function1<SpannableString, Unit> function12 = function1;
                    float width = bitmap.getWidth();
                    int i = C21273718Nb.LIZIZ;
                    int height = (int) ((width * i) / bitmap.getHeight());
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(abstractC21274918Nn2.getContext().getResources(), bitmap);
                    bitmapDrawable.setBounds(0, 0, height, i);
                    C786410Ut5.p2(spannableString2, new ImageSpan(bitmapDrawable, 2), 0, 1, 33);
                    HandlerHook.viewPost(abstractC21274918Nn2, new ARunnableS75S0200000_6(function12, spannableString2, 33));
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // X.AbstractC468201s0, X.InterfaceC1331910klR
            public final void onProgress(float f) {
                if (!C21273718Nb.LJ && f < 0.1f) {
                    C21273718Nb c21273718Nb = C21273718Nb.LIZ;
                    C21273718Nb.LJ = true;
                    Function0<Unit> function03 = function0;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }
            }
        });
    }

    public static void LIZJ(Aweme aweme, AbstractC21274918Nn abstractC21274918Nn, Function1 function1, Function0 function0, Function0 function02) {
        if (aweme != null && abstractC21274918Nn != null) {
            ECAnchorInfo eCAnchorInfoLIZ = LIZ(aweme);
            Integer num = eCAnchorInfoLIZ.prefixStyle;
            if (num != null) {
                if (num.intValue() == 1) {
                    C21273718Nb c21273718Nb = LIZ;
                    List<String> list = eCAnchorInfoLIZ.prefixPrimaryImageUrls;
                    AwS86S0500000_32 awS86S0500000_32 = new AwS86S0500000_32(eCAnchorInfoLIZ, (ECAnchorInfo) abstractC21274918Nn, (AbstractC21274918Nn) function1, (Function1<? super SpannableString, Unit>) function0, (Function0<Unit>) function02, (Function0<Unit>) 0);
                    c21273718Nb.getClass();
                    LIZIZ(list, abstractC21274918Nn, function1, function0, awS86S0500000_32);
                    return;
                }
                if (num.intValue() == 2) {
                    C21273718Nb c21273718Nb2 = LIZ;
                    List<String> list2 = eCAnchorInfoLIZ.prefixSecondaryImageUrls;
                    c21273718Nb2.getClass();
                    LIZIZ(list2, abstractC21274918Nn, function1, function0, function02);
                    return;
                }
            }
            String strLJJIFFI = eCAnchorInfoLIZ.anchorTag;
            if (strLJJIFFI == null) {
                AnchorBizUtils.LIZ.getClass();
                strLJJIFFI = AnchorBizUtils.LJJIFFI(aweme);
                if (strLJJIFFI == null) {
                    strLJJIFFI = "";
                }
            }
            function1.invoke(new SpannableString(strLJJIFFI));
            return;
        }
        function02.invoke();
    }
}
