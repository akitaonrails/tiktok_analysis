package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Mcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572350Mcb {
    public static final C572350Mcb LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C01GW LIZJ;
    public static final List<String> LIZLLL;
    public static final C572340Mca LJ;
    public static final C01GW LJFF;
    public static final List<String> LJI;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C572350Mcb.class, "draftCache", "getDraftCache()[Ljava/lang/String;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217371BqR};
        LIZ = new C572350Mcb();
        LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(213));
        LIZLLL = new ArrayList();
        LJ = new C572340Mca(AFwS194S0000000_8.get$arr$(214), new String[0]);
        LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(693));
        LJI = C1697810uHb.LJIIJJI("cmt_to_post_entrance_module", "cmt_to_post_entrance_element", "cmt_to_post_preview_position", "cmt_to_post_initial_content_source");
    }

    public static InterfaceC497601wk LJ() {
        return (InterfaceC497601wk) LJFF.getValue();
    }

    public static void LIZ(Context context, VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        C443120HZe c443120HZeLIZLLL = LIZLLL(context, videoPublishEditModel);
        String str = (String) c443120HZeLIZLLL.getFirst();
        String str2 = (String) c443120HZeLIZLLL.getSecond();
        List<AVTextExtraStruct> list = (List) c443120HZeLIZLLL.getThird();
        PostPageModel postPageModel = creativeModel.postPageModel;
        postPageModel.markupCaption = str2;
        postPageModel.markupExtra = list;
        CaptionModel captionModel = postPageModel.captionModel;
        captionModel.markupText = str2;
        captionModel.markupExtra = list;
        C572160McI.LJFF(postPageModel.descAutoFillTrack, str, false, true);
        if (C572160McI.LJ()) {
            String str3 = (String) C857780Xku.LIZ(context, videoPublishEditModel, true).getFirst();
            int iLJJJ = a0.LJJJ(str, str3, 0, false, 6);
            ArrayList arrayList = new ArrayList();
            if (iLJJJ >= 0) {
                AVTextExtraStructHelper aVTextExtraStructHelper = AVTextExtraStructHelper.INSTANCE;
                int length = iLJJJ + str3.length();
                Text2ImageModel text2ImageModel = creativeModel.text2ImageModel;
                arrayList.add(aVTextExtraStructHelper.createTextImageCommentStruct(iLJJJ, length, text2ImageModel.fromAuthorId, text2ImageModel.fromAwemeId, text2ImageModel.fromCommentId));
            }
            arrayList.addAll(C857780Xku.LIZIZ(str, arrayList));
            videoPublishEditModel.setTitle(str);
            videoPublishEditModel.setStructList(arrayList);
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.text2ImageModel.isHelpText) {
            str = C572160McI.LIZ(str);
        }
        List listLIZIZ = C857780Xku.LIZIZ(str, C13BV.INSTANCE);
        Pair pairLIZJ = C857780Xku.LIZJ(str, listLIZIZ);
        String str2 = (String) pairLIZJ.getFirst();
        List<AVTextExtraStruct> list = (List) pairLIZJ.getSecond();
        PostPageModel postPageModel = creativeModel.postPageModel;
        postPageModel.markupCaption = str2;
        postPageModel.markupExtra = list;
        CaptionModel captionModel = postPageModel.captionModel;
        captionModel.markupText = str2;
        captionModel.markupExtra = list;
        C572160McI.LJFF(postPageModel.descAutoFillTrack, str, false, true);
        if (C572160McI.LJ()) {
            videoPublishEditModel.setTitle(str);
            videoPublishEditModel.setStructList(new ArrayList(listLIZIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C443120HZe LIZLLL(android.content.Context r8, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9) {
        /*
            r0 = 1
            kotlin.Pair r0 = X.C857780Xku.LIZ(r8, r9, r0)
            java.lang.Object r4 = r0.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            X.0Xkv r0 = new X.0Xkv
            r7 = 0
            r0.<init>(r8, r9, r7)
            java.util.List r5 = r0.LIZ()
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r3 = r5.iterator()
        L24:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L42
            java.lang.Object r0 = r3.next()
            int r1 = r7 + 1
            if (r7 < 0) goto L3e
            X.0Xlm r0 = (X.AbstractC858320Xlm) r0
            java.lang.String r0 = r0.LJIILL(r4)
            r6.add(r0)
            r7 = r1
            goto L24
        L3e:
            X.C1697810uHb.LJIJI()
            throw r2
        L42:
            java.util.Iterator r3 = r6.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r2 = r3.next()
        L50:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r0)
            goto L50
        L6d:
            if (r2 != 0) goto L71
        L6f:
            java.lang.String r2 = ""
        L71:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r5.iterator()
        L7a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r1.next()
            X.0Xlm r0 = (X.AbstractC858320Xlm) r0
            java.util.List r0 = r0.LJI()
            X.C19719612Di.LJJI(r0, r3)
            goto L7a
        L8e:
            X.0HZe r0 = new X.0HZe
            r0.<init>(r4, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572350Mcb.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):X.0HZe");
    }

    public static void LJFF(ForwardMedia forwardMedia, C572370Mcd c572370Mcd) {
        String cid;
        if (Intrinsics.LJFF(c572370Mcd.getShootWay(), "mt_help_post_card_search")) {
            String enterFrom = c572370Mcd.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = forwardMedia.eventType;
            }
            String shootWay = c572370Mcd.getShootWay();
            if (shootWay == null) {
                shootWay = forwardMedia.shootWay;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("entrance", c572370Mcd.getEntrance());
            Bundle etParams = c572370Mcd.getEtParams();
            if (etParams != null) {
                for (String str : etParams.keySet()) {
                    try {
                        Object obj = etParams.get(str);
                        if (obj != null) {
                            if (obj instanceof String) {
                                c0lab.LJ(str, (String) obj);
                            } else if (obj instanceof Integer) {
                                c0lab.LIZ(((Number) obj).intValue(), str);
                            } else if (obj instanceof Long) {
                                c0lab.LIZIZ(((Number) obj).longValue(), str);
                            } else if (obj instanceof Float) {
                                c0lab.LIZJ((Float) obj, str);
                            } else if (obj instanceof Boolean) {
                                c0lab.LJFF(str, ((Boolean) obj).booleanValue());
                            } else if (obj instanceof Double) {
                                c0lab.LJ(str, String.valueOf(((Number) obj).doubleValue()));
                            } else {
                                c0lab.LJ(str, obj.toString());
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            }
            IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
            if (iRecordMobService != null) {
                iRecordMobService.LIZIZ(new C1449410nox(c572370Mcd.getCreationId(), shootWay, enterFrom, null, null, null, null, null, 248), c0lab, null);
                return;
            }
            return;
        }
        String str2 = forwardMedia.eventType;
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("entrance", c572370Mcd.getEntrance());
        Comment commentInfo = c572370Mcd.getCommentInfo();
        if (commentInfo != null) {
            cid = commentInfo.getCid();
        } else {
            cid = null;
        }
        c0lab2.LJ("comment_id", cid);
        Bundle etParams2 = c572370Mcd.getEtParams();
        if (etParams2 != null) {
            for (String str3 : LJI) {
                String string = etParams2.getString(str3);
                if (string != null) {
                    c0lab2.LJ(str3, string);
                }
            }
        }
        IRecordMobService iRecordMobService2 = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
        if (iRecordMobService2 != null) {
            iRecordMobService2.LIZIZ(new C1449410nox(c572370Mcd.getCreationId(), "comment_to_post", str2, null, null, null, null, null, 248), c0lab2, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0ML0] */
    public final C0ML0 LJIIIIZZ(Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd) {
        CreativeInfo creativeInfoLIZIZ = C0DMI.LIZIZ(c572370Mcd.getCreationId());
        LJIIJ(this, context, forwardMedia, c572370Mcd, "page", new AwS374S0200000_8(context, c572370Mcd, 84), AFwS194S0000000_8.get$arr$(215));
        creativeInfoLIZIZ.getCreationId();
        return new C0ML2() { // from class: X.0ML0
        };
    }

    public static void LJII(Context context, VideoPublishEditModel videoPublishEditModel, CreativeInfo creativeInfo, C572370Mcd c572370Mcd, Function1 function1) {
        C23250099c.LIZLLL(LJ(), null, null, new C572110McD(context, videoPublishEditModel, c572370Mcd, System.currentTimeMillis(), creativeInfo, function1, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        if (r5 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        if (r48 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        r48 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        r49 = r5.getTextByAi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        if (r49 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        r49 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        r20 = 0;
        r20 = 0;
        r20 = 0;
        r20 = 0;
        r20 = 0;
        r20 = 0;
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
    
        if (r37.length() != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        r1 = X.C0PEM.LIZ;
        r5 = X.C2107308Nj.LIZ;
        r1 = new X.C059N(r4, null);
        r0.LL = null;
        r0.LLILLJJLI = null;
        r0.LLILLL = null;
        r0.LLILZLL = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (X.C23250099c.LJI(r0, r5, r1) != r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
    
        if (X.C572160McI.LJ() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        r5 = r1.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1.LIZLLL.getShootWay(), "mt_help_post_card_search") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        r4 = r1.LIZLLL.getInputText();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
    
        if (r4 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        LIZIZ(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        r5 = r1.LIZIZ;
        X.C1431780nMW.LIZ.getClass();
        r9 = X.C1431780nMW.LIZ(0);
        r11 = new com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo(r37, 1600, 1200, null, null, 24, null);
        r13 = new com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo(r10, r10 == true ? 1 : 0, r20, r20 == true ? 1 : 0, r20 == true ? 1 : 0, r20 == true ? 1 : 0, r20 == true ? 1 : 0, 0.0f, r10 == true ? 1 : 0, r10 == true ? 1 : 0, r10 == true ? 1 : 0, r10 == true ? 1 : 0, r10 == true ? 1 : 0, r10 == true ? 1 : 0, r10 == true ? 1 : 0, r10 == true ? 1 : 0, r20 == true ? 1 : 0, r10 == true ? 1 : 0, r20 == true ? 1 : 0, r10 == true ? 1 : 0, r10 == true ? 1 : 0, 2097151, r10 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0154, code lost:
    
        if (0.75f > X.C1450870nrJ.LIZJ()) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0156, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0157, code lost:
    
        r13.setFullScreen(r4);
        r8 = new com.ss.android.ugc.aweme.creative.model.edit.SingleImageData(r9, null, r11, null, r13, null, null, new com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo(new java.util.ArrayList(), null, 2, null), null, null, null, 0, null, null, null, null, true, null, null, null, null, null, false, 8322914, null);
        r8.setSynthesisData(new com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult(r37, 1200, 1600, null, null, null, null, null, null, 504, null));
        r7 = r5.creativeModel;
        r5 = new com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData(null, 0, false, null, 0, 0, null, null, null, null, false, false, false, false, false, false, false, false, null, 0, null, 2097151, null);
        r5.setImageList(X.C1697810uHb.LJIILJJIL(r8));
        r8 = X.C1450870nrJ.LJII();
        r5.getSurfaceData().setSurfaceViewWidth(r8.width);
        r5.getSurfaceData().setSurfaceViewHeight(r8.height);
        r7.imageAlbumModel = r5;
        r3 = X.C0PEM.LIZ;
        r4 = X.C2107308Nj.LIZ;
        r3 = new X.C05DK(r6, r37, r1, r48, r49, null);
        r0.LL = null;
        r0.LLILLJJLI = null;
        r0.LLILLL = null;
        r0.LLILZLL = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0226, code lost:
    
        if (X.C23250099c.LJI(r0, r4, r3) != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0228, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0229, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x022c, code lost:
    
        r5.creativeModel.postPageModel.captionModel.markupText = null;
        LIZ(r1.LJ, r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C572380Mce r52, kotlin.jvm.functions.Function1<? super X.C572410Mch, kotlin.Unit> r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r55, X.InterfaceC1364105Vn<? super kotlin.Unit> r56) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572350Mcb.LIZJ(X.0Mce, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0468  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C572380Mce LJI(com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator r35, java.lang.String r36, android.content.Context r37, com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r38, X.C572370Mcd r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C572350Mcb.LJI(com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator, java.lang.String, android.content.Context, com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia, X.0Mcd, boolean):X.0Mce");
    }

    public static AnonymousClass0956 LJIIJ(C572350Mcb c572350Mcb, Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, String str, Function1 function1, Function0 function0) {
        c572350Mcb.getClass();
        return C23250099c.LIZLLL(LJ(), null, null, new C572390Mcf(str, context, forwardMedia, c572370Mcd, function1, function0, null, null), 3);
    }

    public static void LJIIIZ(C572350Mcb c572350Mcb, Context context, final ForwardMedia forwardMedia, final C572370Mcd c572370Mcd, Function0 function0, Function0 function02, C572410Mch c572410Mch, Function1 function1, int i) {
        final C572410Mch c572410Mch2 = c572410Mch;
        final Function0 function03 = function02;
        final Function0 function04 = function0;
        final Function1 function12 = null;
        if ((i & 8) != 0) {
            function04 = null;
        }
        if ((i & 16) != 0) {
            function03 = null;
        }
        if ((i & 32) != 0) {
            c572410Mch2 = null;
        }
        if ((i & 64) == 0) {
            function12 = function1;
        }
        c572350Mcb.getClass();
        final C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && !PopupManager.LJII(C572470Mcn.class)) {
            PopupManager.LJIIZILJ(new C10GR(c19egLIZIZ, forwardMedia, c572370Mcd, function04, function03, c572410Mch2, function12) { // from class: X.0Mcn
                public final C19EG LL;
                public final ForwardMedia LLILLJJLI;
                public final C572370Mcd LLILLL;
                public final Function0<Unit> LLILZ;
                public final Function0<Unit> LLILZIL;
                public final C572410Mch LLILZLL;
                public final Function1<String, Unit> LLIZ;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 0;
                }

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg = this.LL;
                    return new C688120Qyw(c19eg, c19eg, null);
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    FragmentManager supportFragmentManager = this.LL.getSupportFragmentManager();
                    C572460Mcm c572460Mcm = new C572460Mcm(this.LL);
                    c572460Mcm.setSource(this.LLILLJJLI);
                    c572460Mcm.setConfig(this.LLILLL);
                    c572460Mcm.setBeforePublish(this.LLILZ);
                    c572460Mcm.setBeforeEdit(this.LLILZIL);
                    c572460Mcm.setPrefilledResult(this.LLILZLL);
                    c572460Mcm.setOnPublishStart(this.LLIZ);
                    C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.f_2, c572460Mcm, true);
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LIZ.LLJJIII = c572460Mcm;
                    c1390920mIc.LJIIIIZZ(0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJIIJIL = true;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0Mco
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            PopupManager.LIZJ(C572470Mcn.class);
                        }
                    };
                    c572460Mcm.LIZJ(new AwS552S0100000_8(tuxSheet, 402));
                    C572350Mcb c572350Mcb2 = C572350Mcb.LIZ;
                    ForwardMedia forwardMedia2 = this.LLILLJJLI;
                    C572370Mcd c572370Mcd2 = this.LLILLL;
                    c572350Mcb2.getClass();
                    C572350Mcb.LJFF(forwardMedia2, c572370Mcd2);
                    c572460Mcm.LJII(this.LL);
                    tuxSheet.show(supportFragmentManager, "text_image_forward_preview");
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = c19egLIZIZ;
                    this.LLILLJJLI = forwardMedia;
                    this.LLILLL = c572370Mcd;
                    this.LLILZ = function04;
                    this.LLILZIL = function03;
                    this.LLILZLL = c572410Mch2;
                    this.LLIZ = function12;
                }
            }, new C1668306g5("text_2_image_comment_preview_pop_up"));
        }
    }
}
