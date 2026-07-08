package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857950XlB implements InterfaceC856980Xjc {
    @Override // X.InterfaceC856980Xjc
    public final int LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_publish_hashtag_max_limit", true);
    }

    @Override // X.InterfaceC856980Xjc
    public final void LIZIZ() {
        Activity activity;
        Activity activityLIZIZ;
        if (LIZJ()) {
            int iLIZ = LIZ();
            Object objLIZ = null;
            if (C294080Bfq.LIZ()) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                    objLIZ = C1388190mED.LIZ(activityLIZIZ);
                }
            } else {
                AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ2 != null) {
                    objLIZ = abstractC1387200mCcLJ2.LIZ;
                }
            }
            if (!(objLIZ instanceof C19EG) || (activity = (Activity) objLIZ) == null) {
                return;
            }
            String string = activity.getString(2131835469, Integer.valueOf(iLIZ));
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder.message(string);
            C1390380mHk.LIZ(activity, 2061, creativeToastBuilder);
        }
    }

    @Override // X.InterfaceC856980Xjc
    public final boolean LIZJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_limit_hashtag_switch", true, false);
    }

    @Override // X.InterfaceC856980Xjc
    public final int LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        List<AVTextExtraStruct> list = videoPublishEditModel.creativeModel.postPageModel.captionModel.markupExtra;
        if (list.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (AVTextExtraStruct aVTextExtraStruct : list) {
            AVTextExtraStruct aVTextExtraStruct2 = aVTextExtraStruct;
            if (aVTextExtraStruct2.type == 1 && C123100dR.LIZ(aVTextExtraStruct2.hashTagName)) {
                arrayList.add(aVTextExtraStruct);
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C443120HZe<java.lang.String, java.lang.String, java.util.List<com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct>> LJ(final android.content.Context r6, final com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            kotlin.Pair r0 = X.C0MNF.LIZ(r6, r7)
            java.lang.Object r4 = r0.getSecond()
            java.lang.String r4 = (java.lang.String) r4
            X.0XlA r0 = new X.0XlA
            r0.<init>(r6, r7)
            java.util.List r6 = r0.LIZ()
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r6, r0)
            r7.<init>(r0)
            java.util.Iterator r5 = r6.iterator()
            r3 = 0
        L23:
            boolean r0 = r5.hasNext()
            r2 = 0
            if (r0 == 0) goto L41
            java.lang.Object r0 = r5.next()
            int r1 = r3 + 1
            if (r3 < 0) goto L3d
            X.0Xlm r0 = (X.AbstractC858320Xlm) r0
            java.lang.String r0 = r0.LJIILL(r4)
            r7.add(r0)
            r3 = r1
            goto L23
        L3d:
            X.C1697810uHb.LJIJI()
            throw r2
        L41:
            java.util.Iterator r3 = r7.iterator()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r2 = r3.next()
        L4f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r0)
            goto L4f
        L6c:
            if (r2 != 0) goto L70
        L6e:
            java.lang.String r2 = ""
        L70:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r6.iterator()
        L79:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r1.next()
            X.0Xlm r0 = (X.AbstractC858320Xlm) r0
            java.util.List r0 = r0.LJI()
            X.C19719612Di.LJJI(r0, r3)
            goto L79
        L8d:
            X.0HZe r0 = new X.0HZe
            r0.<init>(r4, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C857950XlB.LJ(android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):X.0HZe");
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, Collection collection) {
        Object next;
        if (!collection.isEmpty()) {
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            String str = captionModel.markupText;
            List<AVTextExtraStruct> list = captionModel.markupExtra;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            C857970XlD c857970XlD = new C857970XlD(str, list);
            if (str.length() != 0 && !collection.isEmpty()) {
                ArrayList arrayList = new ArrayList(new C858450Xlz(new C857960XlC(true, C855550XhJ.LIZ())).LIZJ(str, list));
                Iterator it2 = collection.iterator();
                while (true) {
                    next = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    AVChallenge aVChallenge = (AVChallenge) it2.next();
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            AbstractC858320Xlm abstractC858320Xlm = (AbstractC858320Xlm) it3.next();
                            if (abstractC858320Xlm instanceof C858540Xm8) {
                                String str3 = ((C858540Xm8) abstractC858320Xlm).LJIIJ;
                                if (str3 == null) {
                                    str3 = null;
                                }
                                if (Intrinsics.LJFF(str3, aVChallenge.getChallengeName())) {
                                    it3.remove();
                                    if (it3.hasNext()) {
                                        AbstractC858390Xlt abstractC858390Xlt = (AbstractC858390Xlt) it3.next();
                                        C857900Xl6.LIZJ(abstractC858390Xlt);
                                        if ((abstractC858390Xlt instanceof C858350Xlp) && abstractC858390Xlt.LJIILJJIL().length() == 0) {
                                            it3.remove();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((AbstractC858320Xlm) it4.next()).LJIILL(""));
                }
                Iterator it5 = arrayList2.iterator();
                if (it5.hasNext()) {
                    next = it5.next();
                    while (it5.hasNext()) {
                        String str4 = (String) it5.next();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((String) next);
                        sbLIZ.append(str4);
                        next = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                String str5 = (String) next;
                if (str5 != null) {
                    str2 = str5;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    C19719612Di.LJJI(((AbstractC858320Xlm) it6.next()).LJI(), arrayList3);
                }
                c857970XlD = new C857970XlD(str2, arrayList3);
            }
            CharSequence charSequence = c857970XlD.LIZ;
            List<AVTextExtraStruct> list2 = c857970XlD.LIZIZ;
            videoPublishEditModel.creativeModel.postPageModel.captionModel.markupText = charSequence.toString();
            videoPublishEditModel.creativeModel.postPageModel.captionModel.markupExtra = list2;
        }
    }
}
