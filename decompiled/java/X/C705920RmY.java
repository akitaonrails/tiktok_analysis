package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0RmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705920RmY {
    public final C0R9I LIZ;
    public Aweme LIZIZ;
    public InterfaceC19595111lV LIZJ;
    public C690980R8m LIZLLL;
    public C0R60 LJ;
    public C0N0Y LJFF;
    public InterfaceC19598211m0 LJI;
    public C727440SgA LJII;
    public InteractStickerViewModel LJIIIIZZ;
    public String LJIIIZ = "";
    public InterfaceC455470HtZ LJIIJ;
    public AbsInteractStickerWidget LJIIJJI;
    public C19600111mJ LJIIL;

    public final C705930RmZ LIZIZ() {
        InteractStickerViewModel interactStickerViewModel;
        AwemeRawAd awemeRawAd;
        Long creativeId;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        C705930RmZ c705930RmZ = new C705930RmZ();
        c705930RmZ.LJIILIIL = this.LIZJ;
        c705930RmZ.LJIIL = this.LIZLLL;
        c705930RmZ.LJIILJJIL = this.LJI;
        c705930RmZ.LJIILL = this.LJII;
        c705930RmZ.LJIILLIIL = this.LJIIJ;
        c705930RmZ.LJIIZILJ = this.LJ;
        c705930RmZ.LIZJ = C19580611jA.LJFF(this.LIZIZ);
        c705930RmZ.LIZLLL = C19580611jA.LJ(this.LIZIZ);
        Aweme aweme = this.LIZIZ;
        c705930RmZ.LJ = aweme != null ? aweme.getShareUrl() : null;
        c705930RmZ.LJIIJJI = true;
        Aweme aweme2 = this.LIZIZ;
        c705930RmZ.LJI = (aweme2 == null || (awemeRawAd3 = aweme2.getAwemeRawAd()) == null) ? null : awemeRawAd3.getLogExtra();
        Aweme aweme3 = this.LIZIZ;
        c705930RmZ.LJII = (aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null) ? null : awemeRawAd2.getPageFrom();
        Aweme aweme4 = this.LIZIZ;
        c705930RmZ.LJIIIIZZ = (aweme4 == null || (awemeRawAd = aweme4.getAwemeRawAd()) == null || (creativeId = awemeRawAd.getCreativeId()) == null) ? 0L : creativeId.longValue();
        c705930RmZ.LJIIIZ = C716820S9w.LIZ(this.LIZIZ);
        Aweme aweme5 = this.LIZIZ;
        c705930RmZ.LJIJ = aweme5 != null ? aweme5.getVideoReplyStruct() : null;
        c705930RmZ.LJIJI = LJ(this.LIZIZ);
        Aweme aweme6 = this.LIZIZ;
        c705930RmZ.LJIIJ = aweme6 != null ? aweme6.getRequestId() : null;
        c705930RmZ.LJFF = this.LJIIIZ;
        c705930RmZ.LJIJJ = this.LJIIL;
        if (this.LJIIJJI != null && (interactStickerViewModel = this.LJIIIIZZ) != null) {
            interactStickerViewModel.wQ2(c705930RmZ, "interact_sticker_data");
        }
        return c705930RmZ;
    }

    public final void LIZJ() {
        Aweme aweme = this.LIZIZ;
        if (aweme == null || !AwemeExtKt.isProhibited(aweme)) {
            C15O7.LIZJ(new Callable() { // from class: X.0RrG
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strLJIIJ;
                    String string;
                    ArrayList<InteractStickerStruct> arrayList;
                    BusinessExtraData businessExtraData;
                    String stickerIDs;
                    C1C7U.LIZ("FeedInteractStickerManager@587c.bindVideoStickersData$1");
                    C705920RmY c705920RmY = this.LL;
                    C0N0Y c0n0y = c705920RmY.LJFF;
                    if (c0n0y != null) {
                        strLJIIJ = c0n0y.LJIIJ("information");
                        if (strLJIIJ == null) {
                            strLJIIJ = c705920RmY.LJFF.LJIIJ("com.android.information");
                        }
                        if (strLJIIJ == null) {
                            strLJIIJ = c705920RmY.LJFF.LJIIJ("com.apple.quicktime.information");
                        }
                    } else {
                        strLJIIJ = null;
                    }
                    if (TextUtils.isEmpty(strLJIIJ)) {
                        arrayList = null;
                    } else {
                        try {
                            string = JSONObjectProtectorUtils.getString(new JSONObject(JSONObjectProtectorUtils.getString(new JSONObject(strLJIIJ), "com.bytedance.info")), "interaction_stickers");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            string = null;
                        }
                        try {
                            arrayList = (ArrayList) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string, new TypeToken<ArrayList<InteractStickerStruct>>() { // from class: X.0RrH
                            }.getType());
                        } catch (s e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            arrayList = null;
                        }
                    }
                    if (!C086I.LIZIZ(arrayList)) {
                        ArrayList arrayList2 = new ArrayList();
                        if (arrayList != null) {
                            for (InteractStickerStruct interactStickerStruct : arrayList) {
                                if (interactStickerStruct != null) {
                                    try {
                                        businessExtraData = (BusinessExtraData) C7740030o.LIZ().getGson().LJII(JSONObjectProtectorUtils.getString(new JSONObject(interactStickerStruct.getAttr()), "interaction_extra"), BusinessExtraData.class);
                                    } catch (Exception e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                        businessExtraData = null;
                                    }
                                    boolean zContains = false;
                                    if (businessExtraData != null) {
                                        Aweme aweme2 = c705920RmY.LIZIZ;
                                        List listLJJLIIIJILLIZJL = (aweme2 == null || (stickerIDs = aweme2.getStickerIDs()) == null) ? null : a0.LJJLIIIJILLIZJL(stickerIDs, new String[]{","}, 0, 6);
                                        if (!C086I.LIZIZ(listLJJLIIIJILLIZJL)) {
                                            zContains = listLJJLIIIJILLIZJL.contains(businessExtraData.getStickerId());
                                        }
                                    }
                                    if (!zContains) {
                                        arrayList2.add(interactStickerStruct);
                                    }
                                }
                            }
                        }
                        if (arrayList != null) {
                            arrayList.removeAll(arrayList2);
                        }
                    }
                    C1C7U.LIZIZ("FeedInteractStickerManager@587c.bindVideoStickersData$1");
                    return arrayList;
                }
            }).LJ(new InterfaceC2385309Wh() { // from class: X.0RmX
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("FeedInteractStickerManager@587c.bindVideoStickersData$2");
                    C705920RmY c705920RmY = this.LIZ;
                    ArrayList arrayList = (ArrayList) c15o7.LJIIL();
                    if (c705920RmY.LJIIJJI != null) {
                        InteractStickerViewModel interactStickerViewModel = c705920RmY.LJIIIIZZ;
                        if (interactStickerViewModel != null) {
                            interactStickerViewModel.wQ2(arrayList, "interact_sticker_video_data");
                        }
                    } else if (!C086I.LIZIZ(arrayList)) {
                        c705920RmY.LJFF();
                        InteractStickerViewModel interactStickerViewModel2 = c705920RmY.LJIIIIZZ;
                        if (interactStickerViewModel2 != null) {
                            interactStickerViewModel2.wQ2(arrayList, "interact_sticker_video_data");
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedInteractStickerManager@587c.bindVideoStickersData$2");
                    return unit;
                }
            }, C15O7.LJIIIIZZ, null);
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.LJIIIIZZ;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.wQ2(new ArrayList(), "interact_sticker_video_data");
        }
    }

    public final void LIZLLL() {
        if (this.LJIIJJI == null) {
            return;
        }
        InteractStickerViewModel interactStickerViewModel = this.LJIIIIZZ;
        if (interactStickerViewModel != null) {
            interactStickerViewModel.wQ2(null, "interact_sticker_clear_data");
        }
        InteractStickerViewModel interactStickerViewModel2 = this.LJIIIIZZ;
        if (interactStickerViewModel2 != null) {
            interactStickerViewModel2.wQ2(null, "interact_sticker_aweme_data");
        }
        InteractStickerViewModel interactStickerViewModel3 = this.LJIIIIZZ;
        if (interactStickerViewModel3 != null) {
            interactStickerViewModel3.wQ2(null, "interact_sticker_video_data");
        }
    }

    public final void LJFF() {
        AbsInteractStickerWidget absInteractStickerWidgetC6 = this.LIZ.c6();
        this.LJIIJJI = absInteractStickerWidgetC6;
        if (absInteractStickerWidgetC6 != null) {
            absInteractStickerWidgetC6.LJIIZILJ(this.LIZIZ);
        }
        AbsInteractStickerWidget absInteractStickerWidget = this.LJIIJJI;
        this.LJIIIIZZ = absInteractStickerWidget != null ? absInteractStickerWidget.LJIILLIIL() : null;
        LIZIZ();
    }

    public C705920RmY(C0R9I c0r9i) {
        this.LIZ = c0r9i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r2.getUserId() == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r4 = r2.getUserId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            java.lang.String r4 = ""
            if (r5 != 0) goto L5
            return r4
        L5:
            java.util.List r0 = r5.getTextExtra()
            boolean r0 = X.C086I.LIZIZ(r0)
            if (r0 == 0) goto L10
            return r4
        L10:
            java.util.List r0 = r5.getTextExtra()     // Catch: java.lang.ClassCastException -> L36
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.ClassCastException -> L36
        L18:
            boolean r0 = r3.hasNext()     // Catch: java.lang.ClassCastException -> L36
            if (r0 == 0) goto L3a
            java.lang.Object r2 = r3.next()     // Catch: java.lang.ClassCastException -> L36
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r2     // Catch: java.lang.ClassCastException -> L36
            int r1 = r2.getSubtype()     // Catch: java.lang.ClassCastException -> L36
            r0 = 2
            if (r1 != r0) goto L18
            java.lang.String r0 = r2.getUserId()     // Catch: java.lang.ClassCastException -> L36
            if (r0 == 0) goto L3a
            java.lang.String r4 = r2.getUserId()     // Catch: java.lang.ClassCastException -> L36
            return r4
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C705920RmY.LJ(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public final void LIZ(boolean z) {
        List<InteractStickerStruct> interactStickerStructs;
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            interactStickerStructs = aweme.getInteractStickerStructs();
        } else {
            interactStickerStructs = null;
        }
        if (interactStickerStructs == null) {
            if (this.LJIIJJI != null) {
                ArrayList arrayList = new ArrayList();
                InteractStickerViewModel interactStickerViewModel = this.LJIIIIZZ;
                if (interactStickerViewModel != null) {
                    interactStickerViewModel.wQ2(arrayList, "interact_sticker_aweme_data");
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.LIZIZ.getInteractStickerStructs());
        Aweme aweme2 = this.LIZIZ;
        if (aweme2 != null && AwemeExtKt.isProhibited(aweme2)) {
            arrayList2 = new ArrayList();
        }
        if (z) {
            C19719612Di.LJJIIJ(arrayList2, AFwS243S0000000_11.get$arr$(759), true);
        }
        if (C086I.LIZIZ(arrayList2)) {
            if (this.LJIIJJI == null) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            InteractStickerViewModel interactStickerViewModel2 = this.LJIIIIZZ;
            if (interactStickerViewModel2 == null) {
                return;
            }
            interactStickerViewModel2.wQ2(arrayList3, "interact_sticker_aweme_data");
            return;
        }
        if (this.LJIIJJI == null) {
            LJFF();
        }
        InteractStickerViewModel interactStickerViewModel3 = this.LJIIIIZZ;
        if (interactStickerViewModel3 == null) {
            return;
        }
        interactStickerViewModel3.wQ2(arrayList2, "interact_sticker_aweme_data");
    }

    public final void LJII(String str) {
        String aid;
        InteractStickerViewModel interactStickerViewModel;
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid) && (interactStickerViewModel = this.LJIIIIZZ) != null) {
            interactStickerViewModel.wQ2(Boolean.TRUE, "viewholder_select_status_changed");
        }
    }

    public final void LJIIIIZZ(String str) {
        String aid;
        InteractStickerViewModel interactStickerViewModel;
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid) && (interactStickerViewModel = this.LJIIIIZZ) != null) {
            interactStickerViewModel.wQ2(Boolean.FALSE, "viewholder_select_status_changed");
        }
    }

    public final void LJIIJ(Aweme aweme) {
        this.LIZIZ = aweme;
        AbsInteractStickerWidget absInteractStickerWidget = this.LJIIJJI;
        if (absInteractStickerWidget != null) {
            absInteractStickerWidget.LJIIZILJ(aweme);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(android.content.Context r17, androidx.fragment.app.Fragment r18) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C705920RmY.LJIIIZ(android.content.Context, androidx.fragment.app.Fragment):void");
    }

    public final void LJI(float f, float f2, int i) {
        InteractStickerViewModel interactStickerViewModel;
        C443120HZe c443120HZe = new C443120HZe(Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i));
        if (this.LJIIJJI != null && (interactStickerViewModel = this.LJIIIIZZ) != null) {
            interactStickerViewModel.wQ2(c443120HZe, "interact_sticker_delegate_single_tap");
        }
    }
}
