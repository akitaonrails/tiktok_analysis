package X;

import Y.ACallableS30S0100100_14;
import android.app.Activity;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Xkp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857730Xkp {
    public final C19EG LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final C855530XhH LIZJ;
    public final C857480XkQ<AVTextExtraStruct> LIZLLL;
    public final C214848196g LJ;
    public final C857870Xl3 LJI;
    public final C858010XlH LJII;
    public final String LJFF = C0CHQ.LIZ().getAccountService().getCurrentUserID();
    public final C856670Xj7 LJIIIIZZ = new C856670Xj7();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> LIZ() {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C857730Xkp.LIZ():java.util.List");
    }

    public final String LIZLLL() throws Throwable {
        C857480XkQ<AVTextExtraStruct> c857480XkQ = this.LIZLLL;
        c857480XkQ.getClass();
        try {
            CharSequence charSequenceLIZ = c857480XkQ.LIZ.LIZIZ().LIZ(false);
            if (charSequenceLIZ == null) {
                charSequenceLIZ = "";
            }
            C13E8 c13e8LIZ = c857480XkQ.LIZIZ.LIZIZ(charSequenceLIZ, C858730XmR.LIZ(c857480XkQ.LIZ.LIZ(), c857480XkQ.LIZJ, false, 6)).LIZ();
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            for (Object obj : c13e8LIZ) {
                if (((AbstractC858320Xlm) obj) instanceof C858350Xlp) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append(((AbstractC858320Xlm) it2.next()).LJIILJJIL());
            }
            return sb.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String LJFF() {
        return this.LIZLLL.LIZ(false).LIZIZ();
    }

    public final void LJII() {
        final C858010XlH c858010XlH = this.LJII;
        final C857480XkQ<AVTextExtraStruct> c857480XkQ = this.LIZLLL;
        c858010XlH.getClass();
        List<AbstractC858320Xlm<AVTextExtraStruct>> list = c857480XkQ.LJ;
        InterfaceC856090XiB<AVTextExtraStruct> interfaceC856090XiB = c857480XkQ.LIZ;
        InterfaceC858060XlM interfaceC858060XlM = new InterfaceC858060XlM() { // from class: X.0XlG
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(11));

            @Override // X.InterfaceC858060XlM
            public final C858520Xm6 LIZIZ() {
                return (C858520Xm6) this.LIZ.getValue();
            }

            @Override // X.InterfaceC858060XlM
            public final InterfaceC858220Xlc LIZJ() {
                final C857480XkQ<AVTextExtraStruct> c857480XkQ2 = c857480XkQ;
                return new InterfaceC858220Xlc() { // from class: X.0XlF
                    @Override // X.InterfaceC858220Xlc
                    public final void LIZ(EnumC858180XlY enumC858180XlY) {
                        C857470XkP c857470XkPLIZ = c857480XkQ2.LIZ.LIZ();
                        c857470XkPLIZ.getClass();
                        int i = C858190XlZ.LIZ[enumC858180XlY.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                c857470XkPLIZ.LIZ.LLLF++;
                                return;
                            }
                            throw new UnsupportedOperationException("Unknown mask type, not supported yet");
                        }
                        c857470XkPLIZ.LIZ.LLJLLIL++;
                    }
                };
            }

            @Override // X.InterfaceC858060XlM
            public final Activity LIZLLL() {
                return c858010XlH.LIZ;
            }

            @Override // X.InterfaceC858060XlM
            public final int getMaxWidth() {
                return c857480XkQ.LIZ.getWidthLimit();
            }

            @Override // X.InterfaceC858060XlM
            public final EnumC858020XlI getFrom() {
                return EnumC858020XlI.PUBLISH;
            }

            @Override // X.InterfaceC858060XlM
            public final <T> InterfaceC858600XmE<AbstractC858320Xlm<T>> LIZ(AbstractC858320Xlm<T> abstractC858320Xlm) {
                return (InterfaceC858600XmE) ((Map) c858010XlH.LIZIZ.getValue()).get(C13LE.LIZ(abstractC858320Xlm.getClass()));
            }
        };
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
        for (AbstractC858320Xlm abstractC858320Xlm : (ArrayList) list) {
            spannableStringBuilderValueOf.append((CharSequence) interfaceC858060XlM.LIZ(abstractC858320Xlm).LIZ(interfaceC858060XlM, abstractC858320Xlm));
        }
        interfaceC856090XiB.LIZIZ().LIZ.setText(spannableStringBuilderValueOf);
    }

    public final void LJIILJJIL() throws Throwable {
        InterfaceC856090XiB<AVTextExtraStruct> interfaceC856090XiB = this.LIZLLL.LIZ;
        if (interfaceC856090XiB.LIZ().LIZ.LLJILJILJ) {
            if (interfaceC856090XiB.LIZ().LIZ.LLJJL) {
                interfaceC856090XiB.LIZ().LIZ.setShouldDisableTrim(false);
            } else {
                interfaceC856090XiB.LIZ().LIZ.setHasUrlTransforming(false);
                C856400Xig c856400XigLIZIZ = interfaceC856090XiB.LIZIZ();
                int urlStart = interfaceC856090XiB.LIZ().LIZ.getUrlStart();
                int urlEnd = interfaceC856090XiB.LIZ().LIZ.getUrlEnd();
                Editable editableP = C2204961BRm.p(c856400XigLIZIZ.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
                if (editableP != null) {
                    editableP.delete(urlStart, urlEnd);
                }
                C857470XkP c857470XkPLIZ = interfaceC856090XiB.LIZ();
                c857470XkPLIZ.LIZ.setUrlEnd(interfaceC856090XiB.LIZ().LIZ.getUrlStart());
                interfaceC856090XiB.LIZ().LIZ.setTransformingUrlRemoved(true);
            }
        }
        C0ZI0 c0zi0 = interfaceC856090XiB.LIZIZ().LIZ;
        c0zi0.getClass();
        C0DSM.LIZ(c0zi0);
    }

    public static String LIZIZ(List list) {
        Object next;
        if (!((ArrayList) list).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (AVTextExtraStruct aVTextExtraStruct : (ArrayList) list) {
                if (C123100dR.LIZ(aVTextExtraStruct.hashTagName)) {
                    String str = aVTextExtraStruct.hashTagName;
                    if (str != null) {
                        if (arrayList.contains(str)) {
                            continue;
                        } else {
                            String str2 = aVTextExtraStruct.hashTagName;
                            if (str2 != null) {
                                arrayList.add(str2);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) next);
                    sbLIZ.append(',');
                    sbLIZ.append(str3);
                    next = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            String str4 = (String) next;
            if (str4 != null) {
                return str4;
            }
        }
        return "";
    }

    public static String LJ(List list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it2.next();
                if (C123100dR.LIZ(aVTextExtraStruct.hashTagName)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(aVTextExtraStruct.hashTagName);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static void LJI(String str) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("CaptionComponent", str);
    }

    public final void LJIIIIZZ(String str) {
        CharSequence charSequenceSubSequence;
        AVTextExtraStruct aVTextExtraStruct;
        String string;
        CharSequence charSequenceSubSequence2;
        AVTextExtraStruct aVTextExtraStruct2;
        Integer numValueOf;
        Integer numValueOf2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        C0CHQ.LIZ().getPublishService().LJIIJJI();
        if (C856610Xj1.LIZ(videoPublishEditModel)) {
            LJIIIZ(str);
        } else {
            String title = videoPublishEditModel.getTitle();
            String string2 = "";
            if (title == null) {
                title = "";
            }
            if (a0.LJLIIIL(title).toString().length() == 0) {
                videoPublishEditModel.setTitle(a0.LJLIIIL(title).toString());
            }
            String title2 = videoPublishEditModel.getTitle();
            if (title2 != null) {
                InterfaceC856090XiB<AVTextExtraStruct> interfaceC856090XiB = this.LIZLLL.LIZ;
                interfaceC856090XiB.LIZIZ().LIZ.setText(title2);
                interfaceC856090XiB.LIZIZ().LIZ.setSelection(title2.length());
                LJI(title2);
            }
            List<AVTextExtraStruct> structList = videoPublishEditModel.getStructList();
            if (structList != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList<AVTextExtraStruct> arrayList2 = new ArrayList();
                Activity androidContext = this.LIZLLL.LIZ.getAndroidContext();
                C0CHQ.LIZ().getPublishService().LJJJJZ().getClass();
                C858780XmW.LIZ(structList, true);
                AVTextExtraStruct aVTextExtraStruct3 = null;
                for (AVTextExtraStruct aVTextExtraStruct4 : structList) {
                    if (aVTextExtraStruct4.isTransient()) {
                        arrayList2.add(aVTextExtraStruct4);
                    } else {
                        if (aVTextExtraStruct3 != null) {
                            int i = aVTextExtraStruct3.start;
                            int i2 = aVTextExtraStruct4.start;
                            if (i < i2 && i2 < aVTextExtraStruct3.end && !aVTextExtraStruct3.isTransient()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("need correction, struct[");
                                sbLIZ.append(aVTextExtraStruct4.start);
                                sbLIZ.append(", ");
                                sbLIZ.append(aVTextExtraStruct4.end);
                                sbLIZ.append(") violate previous[");
                                if (aVTextExtraStruct3 != null) {
                                    numValueOf = Integer.valueOf(aVTextExtraStruct3.start);
                                } else {
                                    numValueOf = null;
                                }
                                sbLIZ.append(numValueOf);
                                sbLIZ.append(", ");
                                if (aVTextExtraStruct3 != null) {
                                    numValueOf2 = Integer.valueOf(aVTextExtraStruct3.end);
                                } else {
                                    numValueOf2 = null;
                                }
                                sbLIZ.append(numValueOf2);
                                sbLIZ.append(") struct=");
                                sbLIZ.append(aVTextExtraStruct4);
                                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("CaptionComponent", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                        arrayList.add(aVTextExtraStruct4);
                    }
                    aVTextExtraStruct3 = aVTextExtraStruct4;
                }
                String title3 = videoPublishEditModel.getTitle();
                if (title3 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (!C857740Xkq.LIZIZ((AVTextExtraStruct) it2.next(), title3)) {
                            it2.remove();
                        }
                    }
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (AVTextExtraStruct aVTextExtraStruct5 : arrayList2) {
                        if (aVTextExtraStruct5.subType == 1 && aVTextExtraStruct5.isDuet()) {
                            z = true;
                        }
                        if (aVTextExtraStruct5.subType == 1 && !aVTextExtraStruct5.isDuet()) {
                            z2 = true;
                        }
                        if (aVTextExtraStruct5.subType == 2) {
                            z3 = true;
                        }
                    }
                    if (videoPublishEditModel.isDuet() && !z) {
                        try {
                        } catch (Exception e) {
                            e = e;
                        }
                        for (Object obj : arrayList) {
                            if (((AVTextExtraStruct) obj).subType == 1) {
                                AVTextExtraStruct aVTextExtraStruct6 = (AVTextExtraStruct) obj;
                                String title4 = videoPublishEditModel.getTitle();
                                if (title4 == null || (charSequenceSubSequence2 = title4.subSequence(aVTextExtraStruct6.start, aVTextExtraStruct6.end)) == null) {
                                    charSequenceSubSequence2 = "";
                                }
                                string = androidContext.getString(2131832477, charSequenceSubSequence2);
                                try {
                                    aVTextExtraStruct2 = new AVTextExtraStruct();
                                    aVTextExtraStruct2.subType = 1;
                                    try {
                                        int iLJJJ = a0.LJJJ(title3, string, 0, false, 6);
                                        aVTextExtraStruct2.start = iLJJJ;
                                        aVTextExtraStruct2.end = iLJJJ + AVTextExtraStructHelper.INSTANCE.getChainTextLength(string);
                                        aVTextExtraStruct2.setTransient(true);
                                        aVTextExtraStruct2.setDuet(true);
                                    } catch (Exception e2) {
                                        e = e2;
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                                if (!C857740Xkq.LIZ(title3, arrayList2, aVTextExtraStruct2)) {
                                    C857740Xkq.LIZJ(string, title3, arrayList2, arrayList);
                                }
                            }
                            string = "";
                            TryCatchGuardChecker.doCheck(e);
                            C857740Xkq.LIZJ(string, title3, arrayList2, arrayList);
                        }
                        try {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        } catch (Exception e4) {
                            e = e4;
                        }
                    }
                    if (videoPublishEditModel.isStitchMode() && !z2) {
                        try {
                        } catch (Exception e5) {
                            e = e5;
                        }
                        for (Object obj2 : arrayList) {
                            if (((AVTextExtraStruct) obj2).subType == 1) {
                                AVTextExtraStruct aVTextExtraStruct7 = (AVTextExtraStruct) obj2;
                                String title5 = videoPublishEditModel.getTitle();
                                if (title5 == null || (charSequenceSubSequence = title5.subSequence(aVTextExtraStruct7.start, aVTextExtraStruct7.end)) == null) {
                                    charSequenceSubSequence = "";
                                }
                                string2 = androidContext.getString(2131844956, charSequenceSubSequence);
                                try {
                                    aVTextExtraStruct = new AVTextExtraStruct();
                                    aVTextExtraStruct.subType = 1;
                                    int iLJJJ2 = a0.LJJJ(title3, string2, 0, false, 6);
                                    aVTextExtraStruct.start = iLJJJ2;
                                    aVTextExtraStruct.end = iLJJJ2 + AVTextExtraStructHelper.INSTANCE.getChainTextLength(string2);
                                    aVTextExtraStruct.setTransient(true);
                                    aVTextExtraStruct.setDuet(false);
                                } catch (Exception e6) {
                                    e = e6;
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                if (!C857740Xkq.LIZ(title3, arrayList2, aVTextExtraStruct)) {
                                    C857740Xkq.LIZJ(string2, title3, arrayList2, arrayList);
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    CommentVideoModel commentVideoModel = videoPublishEditModel.getCommentVideoModel();
                    if (commentVideoModel != null && commentVideoModel.isComment() && !z3) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('@');
                        sbLIZ3.append(commentVideoModel.getUserName());
                        sbLIZ2.append(androidContext.getString(2131829217, C2188811AlT.LIZIZ(sbLIZ3)));
                        sbLIZ2.append(' ');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        AVTextExtraStruct aVTextExtraStruct8 = new AVTextExtraStruct();
                        aVTextExtraStruct8.subType = 2;
                        int iLJJJ3 = a0.LJJJ(title3, strLIZIZ, 0, false, 6);
                        aVTextExtraStruct8.start = iLJJJ3;
                        aVTextExtraStruct8.end = iLJJJ3 + AVTextExtraStructHelper.INSTANCE.getChainTextLength(strLIZIZ);
                        aVTextExtraStruct8.setTransient(true);
                        if (!C857740Xkq.LIZ(title3, arrayList2, aVTextExtraStruct8)) {
                            C857740Xkq.LIZJ(strLIZIZ, title3, arrayList2, arrayList);
                        }
                    }
                }
                this.LIZLLL.LIZ.LIZ().LIZ.setTextExtraList(C19881612qc.LIZ(C19881612qc.LIZLLL(arrayList, new InterfaceC19882712qn<AVTextExtraStruct, TextExtraStruct>() { // from class: X.0XmS
                    @Override // X.InterfaceC19882712qn
                    public final TextExtraStruct apply(AVTextExtraStruct aVTextExtraStruct9) {
                        AVTextExtraStruct aVTextExtraStruct10 = aVTextExtraStruct9;
                        TextExtraStruct textExtraStruct = new TextExtraStruct();
                        textExtraStruct.setCid(aVTextExtraStruct10.cid);
                        textExtraStruct.setHashTagName(aVTextExtraStruct10.hashTagName);
                        textExtraStruct.setUserId(aVTextExtraStruct10.userId);
                        textExtraStruct.setAtUserType(aVTextExtraStruct10.atUserType);
                        textExtraStruct.setType(aVTextExtraStruct10.type);
                        textExtraStruct.setStart(aVTextExtraStruct10.start);
                        textExtraStruct.setEnd(aVTextExtraStruct10.end);
                        textExtraStruct.setAwemeId(aVTextExtraStruct10.awemeId);
                        textExtraStruct.setSubType(aVTextExtraStruct10.subType);
                        textExtraStruct.setSecUid(aVTextExtraStruct10.getSecUid());
                        if (aVTextExtraStruct10.start < 0 || aVTextExtraStruct10.end < 0) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("TextExtraStruct#getStart && TextExtraStruct#getEnd must be >= 0, actual: ");
                            sbLIZ4.append(aVTextExtraStruct10);
                            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        return textExtraStruct;
                    }
                })));
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("legacy restored metadata: ");
                sbLIZ4.append(C857750Xkr.LIZ(structList));
                LJI(C2188811AlT.LIZIZ(sbLIZ4));
                videoPublishEditModel.creativeModel.postPageModel.transientExtra = arrayList2;
            }
            LJIIL(videoPublishEditModel);
            LJIIIZ(str);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C856670Xj7 c856670Xj7 = this.LJIIIIZZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ;
        c856670Xj7.getClass();
        C856670Xj7.LIZ(videoPublishEditModel2, str, jCurrentTimeMillis2);
    }

    public final void LJIIIZ(String str) {
        String string;
        try {
            this.LJI.LIZ();
            this.LJI.LIZIZ();
            LJII();
        } catch (C1955307lH e) {
            TryCatchGuardChecker.doCheck(e);
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("contentType", C1428470nHB.LJIILL(this.LIZIZ));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("#restoreCaptionStateWithNewProtocol");
            pairArr[1] = new Pair(Scene.SCENE_SERVICE, C2188811AlT.LIZIZ(sbLIZ));
            String title = this.LIZIZ.getTitle();
            String str2 = "";
            if (title == null) {
                title = "";
            }
            pairArr[2] = new Pair("title", title);
            List<AVTextExtraStruct> structList = this.LIZIZ.getStructList();
            if (structList == null || (string = structList.toString()) == null) {
                string = "";
            }
            pairArr[3] = new Pair("extra", string);
            String str3 = this.LIZIZ.creativeModel.postPageModel.captionModel.markupText;
            if (str3 != null) {
                str2 = str3;
            }
            pairArr[4] = new Pair("markupText", str2);
            pairArr[5] = new Pair("markupExtra", this.LIZIZ.creativeModel.postPageModel.captionModel.markupExtra.toString());
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            C0CHQ.LIZ().getPublishService().LJJ();
            C857760Xks.LIZIZ(e, mapLJIIIIZZ);
        }
    }

    public final void LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        String strLJI;
        C0I7D c0i7d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LJIILJJIL();
        C214848196g c214848196g = this.LJ;
        if (c214848196g != null && (c0i7d = c214848196g.LJIILL) != null) {
            C0DSM.LIZ(c0i7d);
        }
        CharSequence charSequenceLIZ = this.LIZLLL.LIZ.LIZIZ().LIZ(false);
        if (charSequenceLIZ != null) {
            videoPublishEditModel.setTitle(charSequenceLIZ.toString());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("display text: ");
            sbLIZ.append(videoPublishEditModel.getTitle());
            LJI(C2188811AlT.LIZIZ(sbLIZ));
        }
        C214848196g c214848196g2 = this.LJ;
        if (c214848196g2 != null) {
            strLJI = c214848196g2.LJI();
        } else {
            strLJI = null;
        }
        videoPublishEditModel.setHeading(strLJI);
        List<AVTextExtraStruct> listLIZ = C858730XmR.LIZ(this.LIZLLL.LIZ.LIZ(), this.LJFF, false, 6);
        videoPublishEditModel.setStructList(listLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("legacy metadata(size=");
        sbLIZ2.append(((ArrayList) listLIZ).size());
        sbLIZ2.append("): ");
        sbLIZ2.append(C857750Xkr.LIZ(listLIZ));
        LJI(C2188811AlT.LIZIZ(sbLIZ2));
        LJIILIIL(videoPublishEditModel, false);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C856670Xj7 c856670Xj7 = this.LJIIIIZZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ;
        c856670Xj7.getClass();
        C856670Xj7.LIZIZ(videoPublishEditModel2, "draft", jCurrentTimeMillis2);
    }

    public final void LJIIJJI(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C857530XkV<AVTextExtraStruct> c857530XkVLIZ = this.LIZLLL.LIZ(z);
            this.LIZIZ.creativeModel.postPageModel.captionModel.markupText = c857530XkVLIZ.LIZIZ();
            this.LIZIZ.creativeModel.postPageModel.captionModel.markupExtra = c857530XkVLIZ.LIZ();
        } catch (C857510XkT e) {
            TryCatchGuardChecker.doCheck(e);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C856670Xj7 c856670Xj7 = this.LJIIIIZZ;
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        c856670Xj7.getClass();
        C856670Xj7.LIZIZ(videoPublishEditModel, "preview", jCurrentTimeMillis2);
    }

    public final void LJIIL(VideoPublishEditModel videoPublishEditModel) {
        String string;
        C0I7D c0i7d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LJIILJJIL();
        C214848196g c214848196g = this.LJ;
        if (c214848196g != null && (c0i7d = c214848196g.LJIILL) != null) {
            C0DSM.LIZ(c0i7d);
        }
        CharSequence charSequenceLIZ = this.LIZLLL.LIZ.LIZIZ().LIZ(true);
        if (charSequenceLIZ != null) {
            string = charSequenceLIZ.toString();
        } else {
            string = null;
        }
        videoPublishEditModel.setTitle(string);
        C214848196g c214848196g2 = this.LJ;
        if (c214848196g2 != null && c214848196g2.LJIIJ) {
            videoPublishEditModel.setHeading(c214848196g2.LJI());
        }
        videoPublishEditModel.setStructList(C858730XmR.LIZ(this.LIZLLL.LIZ.LIZ(), this.LJFF, true, 2));
        LJIILIIL(videoPublishEditModel, true);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (((Boolean) C280900Azg.LIZ.getValue()).booleanValue()) {
            C15O7.LIZJ(new ACallableS30S0100100_14(jCurrentTimeMillis2, this, 1));
            return;
        }
        C856670Xj7 c856670Xj7 = this.LJIIIIZZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ;
        c856670Xj7.getClass();
        C856670Xj7.LIZIZ(videoPublishEditModel2, "publish", jCurrentTimeMillis2);
    }

    public static String LIZJ(String str, List list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it2.next();
                if (C123100dR.LIZ(aVTextExtraStruct.hashTagName)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('#');
                    sbLIZ.append(aVTextExtraStruct.hashTagName);
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (aVTextExtraStruct.end < str.length() && str.charAt(aVTextExtraStruct.end) == ' ') {
                    sb.append(' ');
                }
            }
            return sb.toString();
        }
        return "";
    }

    public final void LJIILIIL(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String string;
        String strLIZJ;
        String str = "";
        try {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("studio_mock_illegal_video_description", false)) {
                C0CHQ.LIZ().LJIIJJI();
            }
            C857530XkV<AVTextExtraStruct> c857530XkVLIZ = this.LIZLLL.LIZ(z);
            String strLIZIZ = c857530XkVLIZ.LIZIZ();
            List<AVTextExtraStruct> listLIZ = c857530XkVLIZ.LIZ();
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            PostPageModel postPageModel = creativeModel.postPageModel;
            postPageModel.markupCaption = strLIZIZ;
            postPageModel.markupExtra = listLIZ;
            creativeModel.commonMobModel.hashtagList = LIZIZ(listLIZ);
            CommonMobParamModel commonMobParamModel = creativeModel.commonMobModel;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "title_without_hashtag_length_switch", true, false)) {
                strLIZJ = LJ(creativeModel.postPageModel.markupExtra);
            } else {
                String title = videoPublishEditModel.getTitle();
                if (title == null) {
                    title = "";
                }
                strLIZJ = LIZJ(title, videoPublishEditModel.getStructList());
            }
            commonMobParamModel.pureHashtagString = strLIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("markup text: ");
            sbLIZ.append(videoPublishEditModel.creativeModel.postPageModel.markupCaption);
            LJI(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("markup metadata(size=");
            sbLIZ2.append(videoPublishEditModel.creativeModel.postPageModel.markupExtra.size());
            sbLIZ2.append("): ");
            sbLIZ2.append(C857750Xkr.LIZ(videoPublishEditModel.creativeModel.postPageModel.markupExtra));
            LJI(C2188811AlT.LIZIZ(sbLIZ2));
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            captionModel.markupText = strLIZIZ;
            captionModel.markupExtra = listLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJI("snapshot caption state for publish failed");
            CharSequence charSequenceLIZ = this.LIZLLL.LIZ.LIZIZ().LIZ(z);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("displayText: ");
            sbLIZ3.append((Object) charSequenceLIZ);
            LJI(C2188811AlT.LIZIZ(sbLIZ3));
            String strLIZ = C857750Xkr.LIZ(C858730XmR.LIZ(this.LIZLLL.LIZ.LIZ(), C0CHQ.LIZ().getAccountService().getCurrentUserID(), z, 2));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("metadata: ");
            sbLIZ4.append(strLIZ);
            LJI(C2188811AlT.LIZIZ(sbLIZ4));
            Pair[] pairArr = new Pair[8];
            pairArr[0] = new Pair("contentType", C1428470nHB.LJIILL(this.LIZIZ));
            pairArr[1] = new Pair(Scene.SCENE_SERVICE, "snapshotCaptionStateWithNewProtocol");
            String title2 = this.LIZIZ.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            pairArr[2] = new Pair("title", title2);
            List<AVTextExtraStruct> structList = this.LIZIZ.getStructList();
            if (structList == null || (string = structList.toString()) == null) {
                string = "";
            }
            pairArr[3] = new Pair("extra", string);
            String str2 = this.LIZIZ.creativeModel.postPageModel.captionModel.markupText;
            if (str2 != null) {
                str = str2;
            }
            pairArr[4] = new Pair("markupText", str);
            pairArr[5] = new Pair("markupExtra", this.LIZIZ.creativeModel.postPageModel.captionModel.markupExtra.toString());
            pairArr[6] = new Pair("displayText", String.valueOf(charSequenceLIZ));
            pairArr[7] = new Pair("displayMetadata", strLIZ);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            C0CHQ.LIZ().getPublishService().LJJ();
            C857760Xks.LIZIZ(e, mapLJIIIIZZ);
        }
    }

    public C857730Xkp(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, C855530XhH c855530XhH, C857480XkQ<AVTextExtraStruct> c857480XkQ, C214848196g c214848196g) {
        this.LIZ = c19eg;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = c855530XhH;
        this.LIZLLL = c857480XkQ;
        this.LJ = c214848196g;
        this.LJI = new C857870Xl3(c19eg, videoPublishEditModel, c857480XkQ);
        this.LJII = new C858010XlH(c19eg);
        C2296808zG.LIZ(C0PEM.LIZJ);
    }
}
