package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0F7L, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F7L {
    public static final C0F7L LIZ = new C0F7L();

    public static InterfaceC1409370mmN LIZ(final VideoPublishEditModel videoPublishEditModel) {
        if (C1428470nHB.LJLIIL(videoPublishEditModel)) {
            return new InterfaceC1409370mmN(videoPublishEditModel) { // from class: X.0F7J
                public final VideoPublishEditModel LIZ;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
                @Override // X.InterfaceC1409370mmN
                public final String LIZ() {
                    List arrayList;
                    List<SingleImageData> imageList;
                    ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
                    if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                        arrayList = C13BV.INSTANCE;
                    } else {
                        arrayList = new ArrayList();
                        Iterator<SingleImageData> it2 = imageList.iterator();
                        while (it2.hasNext()) {
                            List<TextStickerData> listLJFF = C0F7U.LJFF(it2.next(), C1416310mxZ.LJJLIIIJJIZ(this.LIZ));
                            ArrayList arrayList2 = new ArrayList();
                            for (TextStickerData textStickerData : listLJFF) {
                                List<SubTemplateInfo> subTemplates = textStickerData.getCompatModel().getSubTemplates();
                                ?? arrayList3 = new ArrayList();
                                Iterator<SubTemplateInfo> it3 = subTemplates.iterator();
                                while (it3.hasNext()) {
                                    String str = it3.next().text;
                                    if (str != null) {
                                        arrayList3.add(str);
                                    }
                                }
                                if (!(!arrayList3.isEmpty())) {
                                    arrayList3 = C1697810uHb.LJIIL(textStickerData.getTextStr());
                                }
                                C19719612Di.LJJI(arrayList3, arrayList2);
                            }
                            C19719612Di.LJJI(arrayList2, arrayList);
                        }
                    }
                    return C13LP.LJJLIIIJ(arrayList, " | ", null, null, 0, null, null, 62);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
                @Override // X.InterfaceC1409370mmN
                public final List<String> LIZIZ() {
                    List<SingleImageData> imageList;
                    SingleImageData singleImageData;
                    List<TextStickerData> listLJFF;
                    ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
                    if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) == null || (listLJFF = C0F7U.LJFF(singleImageData, C1416310mxZ.LJJLIIIJJIZ(this.LIZ))) == null) {
                        return C13BV.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (TextStickerData textStickerData : listLJFF) {
                        List<SubTemplateInfo> subTemplates = textStickerData.getCompatModel().getSubTemplates();
                        ?? arrayList2 = new ArrayList();
                        Iterator<SubTemplateInfo> it2 = subTemplates.iterator();
                        while (it2.hasNext()) {
                            String str = it2.next().text;
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = C1697810uHb.LJIIL(textStickerData.getTextStr());
                        }
                        C19719612Di.LJJI(arrayList2, arrayList);
                    }
                    return arrayList;
                }

                {
                    this.LIZ = videoPublishEditModel;
                }
            };
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return new InterfaceC1409370mmN(videoPublishEditModel) { // from class: X.0F7K
                public final VideoPublishEditModel LIZ;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
                @Override // X.InterfaceC1409370mmN
                public final String LIZ() {
                    List<TextStickerData> listLJI = C0F7U.LJI(this.LIZ);
                    ArrayList arrayList = new ArrayList();
                    for (TextStickerData textStickerData : listLJI) {
                        List<SubTemplateInfo> subTemplates = textStickerData.getCompatModel().getSubTemplates();
                        ?? arrayList2 = new ArrayList();
                        Iterator<SubTemplateInfo> it2 = subTemplates.iterator();
                        while (it2.hasNext()) {
                            String str = it2.next().text;
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        if (!(!arrayList2.isEmpty())) {
                            arrayList2 = C1697810uHb.LJIIL(textStickerData.getTextStr());
                        }
                        C19719612Di.LJJI(arrayList2, arrayList);
                    }
                    return C13LP.LJJLIIIJ(arrayList, " | ", null, null, 0, null, null, 62);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
                @Override // X.InterfaceC1409370mmN
                public final List<String> LIZIZ() {
                    List<TextStickerData> listLJI = C0F7U.LJI(this.LIZ);
                    ArrayList arrayList = new ArrayList();
                    for (TextStickerData textStickerData : listLJI) {
                        List<SubTemplateInfo> subTemplates = textStickerData.getCompatModel().getSubTemplates();
                        ?? arrayList2 = new ArrayList();
                        Iterator<SubTemplateInfo> it2 = subTemplates.iterator();
                        while (it2.hasNext()) {
                            String str = it2.next().text;
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = C1697810uHb.LJIIL(textStickerData.getTextStr());
                        }
                        C19719612Di.LJJI(arrayList2, arrayList);
                    }
                    return arrayList;
                }

                {
                    this.LIZ = videoPublishEditModel;
                }
            };
        }
        return new InterfaceC1409370mmN(videoPublishEditModel) { // from class: X.0F7M
            public final VideoPublishEditModel LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
            @Override // X.InterfaceC1409370mmN
            public final String LIZ() {
                List<TextStickerData> listLJI = C0F7U.LJI(this.LIZ);
                ArrayList arrayList = new ArrayList();
                for (TextStickerData textStickerData : listLJI) {
                    List<SubTemplateInfo> subTemplates = textStickerData.getCompatModel().getSubTemplates();
                    ?? arrayList2 = new ArrayList();
                    Iterator<SubTemplateInfo> it2 = subTemplates.iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().text;
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    if (!(!arrayList2.isEmpty())) {
                        arrayList2 = C1697810uHb.LJIIL(textStickerData.getTextStr());
                    }
                    C19719612Di.LJJI(arrayList2, arrayList);
                }
                return C13LP.LJJLIIIJ(arrayList, " | ", null, null, 0, null, null, 62);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
            @Override // X.InterfaceC1409370mmN
            public final List<String> LIZIZ() {
                List<TextStickerData> listLJI = C0F7U.LJI(this.LIZ);
                ArrayList arrayList = new ArrayList();
                for (TextStickerData textStickerData : listLJI) {
                    List<SubTemplateInfo> subTemplates = textStickerData.getCompatModel().getSubTemplates();
                    ?? arrayList2 = new ArrayList();
                    Iterator<SubTemplateInfo> it2 = subTemplates.iterator();
                    while (it2.hasNext()) {
                        String str = it2.next().text;
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        arrayList2 = C1697810uHb.LJIIL(textStickerData.getTextStr());
                    }
                    C19719612Di.LJJI(arrayList2, arrayList);
                }
                return arrayList;
            }

            {
                this.LIZ = videoPublishEditModel;
            }
        };
    }
}
