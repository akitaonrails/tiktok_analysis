package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Xlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858260Xlg {
    public final Context LIZ;
    public final C430490GuN LIZIZ;

    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        String title;
        String title2;
        ArrayList<AVTextExtraStruct> arrayList;
        List<AVTextExtraStruct> structList = null;
        if (videoPublishEditModel != null && (title = videoPublishEditModel.getTitle()) != null && title.length() != 0) {
            C430490GuN c430490GuN = this.LIZIZ;
            int visibility = c430490GuN.getVisibility();
            c430490GuN.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c430490GuN);
            if (videoPublishEditModel != null) {
                title2 = videoPublishEditModel.getTitle();
                structList = videoPublishEditModel.getStructList();
                if (title2 != null && a0.LJJIIZI(title2, "\n", false)) {
                    String title3 = videoPublishEditModel.getTitle();
                    if (title3 == null) {
                        title3 = "";
                    }
                    String strReplace = new Regex("\n+").replace(title3, " ");
                    List<AVTextExtraStruct> structList2 = videoPublishEditModel.getStructList();
                    if (structList2 != null) {
                        arrayList = new ArrayList(structList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    C08XD.LJJ(arrayList, new Comparator() { // from class: X.0SdW
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return Intrinsics.LJI(((AVTextExtraStruct) obj).start, ((AVTextExtraStruct) obj2).start);
                        }
                    });
                    int length = 0;
                    for (AVTextExtraStruct aVTextExtraStruct : arrayList) {
                        String strSubstring = title3.substring(aVTextExtraStruct.start, aVTextExtraStruct.end);
                        int iLJJJ = a0.LJJJ(strReplace, strSubstring, length, false, 4);
                        if (iLJJJ >= 0) {
                            length = strSubstring.length() + iLJJJ;
                            aVTextExtraStruct.start = iLJJJ;
                            aVTextExtraStruct.end = length;
                        }
                    }
                    Pair pair = new Pair(arrayList, strReplace);
                    structList = (List) pair.first;
                    title2 = (String) pair.second;
                }
            } else {
                title2 = null;
            }
            this.LIZIZ.setText(title2);
            this.LIZIZ.setTextColor(C960203pA.LIZ(R.attr.bx, this.LIZ));
            if (structList != null) {
                for (AVTextExtraStruct aVTextExtraStruct2 : structList) {
                    if (aVTextExtraStruct2.type == 0) {
                        int i = aVTextExtraStruct2.subType;
                        if (i != 1) {
                            if (i == 2) {
                                new C0GZ8(this.LIZ, new C0GZ7() { // from class: X.0Xli
                                    @Override // X.C0GZ7
                                    public final void LIZ() {
                                    }

                                    @Override // X.C0GZ7
                                    public final int getMaxWidth() {
                                        return this.LIZ.LIZIZ.getHookAtMaxWidth();
                                    }
                                }).LLJILJIL = BitmapFactory.decodeResource(this.LIZ.getResources(), R.drawable.ddk);
                            }
                        } else {
                            new C0GZ6(this.LIZ, new C0GZ7() { // from class: X.0Xlh
                                @Override // X.C0GZ7
                                public final void LIZ() {
                                }

                                @Override // X.C0GZ7
                                public final int getMaxWidth() {
                                    return this.LIZ.LIZIZ.getHookAtMaxWidth();
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public final boolean LIZIZ(final VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        C0CHQ.LIZ().getPublishService().LJIIJJI();
        if (!C856610Xj1.LIZ(videoPublishEditModel)) {
            return false;
        }
        CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
        String str = captionModel.markupText;
        if (str == null) {
            str = "";
        }
        List<AbstractC858320Xlm<AVTextExtraStruct>> listLIZJ = new C858450Xlz(new C857960XlC(true, C855550XhJ.LIZ())).LIZJ(str, captionModel.markupExtra);
        if (((C13E8) listLIZJ).isEmpty()) {
            return false;
        }
        C430490GuN c430490GuN = this.LIZIZ;
        int visibility = c430490GuN.getVisibility();
        c430490GuN.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c430490GuN);
        InterfaceC858060XlM interfaceC858060XlM = new InterfaceC858060XlM() { // from class: X.0XlJ
            @Override // X.InterfaceC858060XlM
            public final C858520Xm6 LIZIZ() {
                return new C858520Xm6(false);
            }

            @Override // X.InterfaceC858060XlM
            public final InterfaceC858220Xlc LIZJ() {
                return new InterfaceC858220Xlc() { // from class: X.0XlK
                    @Override // X.InterfaceC858220Xlc
                    public final void LIZ(EnumC858180XlY enumC858180XlY) {
                    }
                };
            }

            @Override // X.InterfaceC858060XlM
            public final Activity LIZLLL() {
                Activity activityLIZ = C0FNT.LIZ(this.LIZ.LIZ);
                if (activityLIZ != null) {
                    return activityLIZ;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }

            @Override // X.InterfaceC858060XlM
            public final EnumC858020XlI getFrom() {
                return C1428470nHB.LJJZZI(videoPublishEditModel) ? EnumC858020XlI.IMAGE_PUBLISH_PREVIEW : EnumC858020XlI.PUBLISH_PREVIEW;
            }

            @Override // X.InterfaceC858060XlM
            public final int getMaxWidth() {
                return this.LIZ.LIZIZ.getHookAtMaxWidth();
            }

            @Override // X.InterfaceC858060XlM
            public final <T> InterfaceC858600XmE<AbstractC858320Xlm<T>> LIZ(AbstractC858320Xlm<T> abstractC858320Xlm) {
                return (InterfaceC858600XmE) ((LinkedHashMap) C858090XlP.LIZ(false)).get(C13LE.LIZ(abstractC858320Xlm.getClass()));
            }
        };
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf("");
        for (AbstractC858320Xlm abstractC858320Xlm : (AbstractList) listLIZJ) {
            spannableStringBuilderValueOf.append((CharSequence) interfaceC858060XlM.LIZ(abstractC858320Xlm).LIZ(interfaceC858060XlM, abstractC858320Xlm));
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            this.LIZIZ.setText(a0.LJLIIL(spannableStringBuilderValueOf, '\n'));
        } else {
            this.LIZIZ.setText(spannableStringBuilderValueOf);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, this.LIZ);
        if (numLIZJ != null) {
            this.LIZIZ.setTextColor(numLIZJ.intValue());
        }
        return true;
    }

    public C858260Xlg(Context context, C430490GuN c430490GuN) {
        this.LIZ = context;
        this.LIZIZ = c430490GuN;
    }
}
