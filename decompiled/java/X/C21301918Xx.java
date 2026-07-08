package X;

import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContent;
import com.ss.android.ugc.aweme.creation.config.DMEncryptedImageContentExtra;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.VisualPoetUserCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetPictureStructComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetSystemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VisualPoetUserComponent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21301918Xx implements InterfaceC905380ZfU {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIZ;
    public final String LIZ;
    public final Map<String, String> LIZIZ;
    public final String LIZJ;
    public final C09KU LIZLLL;
    public final C18UZ LJ;
    public final Function0<Unit> LJFF;
    public final List<C09KT<?, ?>> LJI;
    public final List<C09KT<?, ?>> LJII;
    public volatile C09KL LJIIIIZZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21301918Xx.class, "uploadStep", "getUploadStep()Lcom/ss/android/ugc/tools/VisualPoetImageUploadStep;", 0);
        C13LE.LIZ.getClass();
        LJIIIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C21301918Xx() {
        throw null;
    }

    @Override // X.InterfaceC905380ZfU
    public final PersistentExtraData LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC905380ZfU
    public final Map<String, String> getLocalExt() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC905380ZfU
    public final List<C09KT<?, ?>> LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC905380ZfU
    public final C09KU LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC905380ZfU
    public final List<C09KT<?, ?>> LIZLLL() {
        return this.LJII;
    }

    @Override // X.InterfaceC905380ZfU
    public final String getConversationId() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC905380ZfU
    public final Map<String, String> getExt() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC905380ZfU
    public final String getScene() {
        return this.LIZ;
    }

    public static C0YC6 LJ(C21295818Vo c21295818Vo) {
        C0YC6 c0yc6 = new C0YC6(null, null, null, 0L, null, 0, new LinkedHashMap(), 0, null, null, null, null, null, null, null, null);
        c0yc6.setIndex(0);
        c0yc6.setLocalPath(c21295818Vo.LIZIZ);
        c0yc6.setOriginalWidth(c21295818Vo.LIZJ);
        c0yc6.setOriginalHeight(c21295818Vo.LIZLLL);
        C13DA c13da = new C13DA();
        VisualPoetUserComponent.Companion.getClass();
        c13da.put(VisualPoetUserComponent.VISUAL_POET_USER_COMPONENT_KEY, "1");
        c0yc6.updateExt(c13da.build());
        c0yc6.setMediaType(EnumC870720YDu.IMG);
        c0yc6.setLength(c21295818Vo.LJ);
        return c0yc6;
    }

    public static VisualPoetUserCardTemplate LJFF(C18UZ c18uz, List list) {
        boolean z;
        VisualPoetSystemComponent visualPoetSystemComponent;
        String uri;
        String secretKey;
        ResolutionComponent resolutionComponent;
        DMEncryptedImageContentExtra extra;
        String str = c18uz.LIZJ;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            visualPoetSystemComponent = null;
        } else {
            visualPoetSystemComponent = new VisualPoetSystemComponent(c18uz.LIZJ, 2);
        }
        String str2 = c18uz.LIZIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DMUploadImageResult dMUploadImageResult = (DMUploadImageResult) it2.next();
            DMEncryptedImageContent dMEncryptedImageContent = dMUploadImageResult.decryptData;
            if (dMEncryptedImageContent == null || (uri = dMEncryptedImageContent.getUri()) == null) {
                uri = "";
            }
            C13BV c13bv = C13BV.INSTANCE;
            DMEncryptedImageContent dMEncryptedImageContent2 = dMUploadImageResult.decryptData;
            if (dMEncryptedImageContent2 != null) {
                secretKey = dMEncryptedImageContent2.getSecretKey();
            } else {
                secretKey = null;
            }
            DMEncryptedImageContent dMEncryptedImageContent3 = dMUploadImageResult.decryptData;
            if (dMEncryptedImageContent3 != null && (extra = dMEncryptedImageContent3.getExtra()) != null) {
                resolutionComponent = new ResolutionComponent(extra.width, extra.height);
            } else {
                resolutionComponent = null;
            }
            arrayList.add(new VisualPoetPictureStructComponent(new ImageComponent(c13bv, uri, resolutionComponent, secretKey, (IconTypeComponent) null, 36), 2));
        }
        String str4 = c18uz.LJ;
        if (str4 != null) {
            str3 = str4;
        }
        VisualPoetUserComponent visualPoetUserComponent = new VisualPoetUserComponent(str2, arrayList, str3);
        Map map = c18uz.LIZLLL;
        if (map == null) {
            map = new HashMap();
        }
        PreviewHintComponent.Companion.getClass();
        PreviewHintComponent previewHintComponentLIZ = C18Y9.LIZ();
        BaseRequestComponent.Companion.getClass();
        return new VisualPoetUserCardTemplate(visualPoetUserComponent, visualPoetSystemComponent, false, false, map, null, previewHintComponentLIZ, C18Y8.LIZ(), new BaseResponseComponent(0L, 15), null, null, null);
    }

    public C21301918Xx(String str, C18UQ c18uq, C18UZ c18uz, C18UU c18uu) {
        List<C09KT<?, ?>> listSingletonList;
        Map<String, String> mapLJ = C2097608Jq.LJ();
        this.LIZ = "visual_poet_user";
        this.LIZIZ = mapLJ;
        this.LIZJ = str;
        this.LIZLLL = c18uq;
        this.LJ = c18uz;
        this.LJFF = c18uu;
        this.LJI = Collections.singletonList(new C09KT<Void, Pair<? extends BaseTemplate, ? extends List<? extends C0YC6>>>() { // from class: X.18Xz
            @Override // X.C09KT
            public final Object LIZ(Object obj, C874520YSk c874520YSk) {
                VisualPoetUserCardTemplate visualPoetUserCardTemplateLJFF = C21301918Xx.LJFF(this.LIZ.LJ, C13BV.INSTANCE);
                List<C21295818Vo> list = this.LIZ.LJ.LJFF;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C21295818Vo> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C21301918Xx.LJ(it2.next()));
                }
                return new Pair(visualPoetUserCardTemplateLJFF, arrayList);
            }
        });
        if (!c18uz.LJFF.isEmpty()) {
            C09KT[] c09ktArr = new C09KT[3];
            c09ktArr[0] = new C09KT<Void, List<? extends MediaModel>>() { // from class: X.18Y0
                @Override // X.C09KT
                public final Object LIZ(Object obj, C874520YSk c874520YSk) {
                    List<C21295818Vo> list = this.LIZ.LJ.LJFF;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (C21295818Vo c21295818Vo : list) {
                        MediaModel mediaModel = new MediaModel(c21295818Vo.LIZ);
                        mediaModel.LJIILL(c21295818Vo.LIZIZ);
                        arrayList.add(mediaModel);
                    }
                    return arrayList;
                }
            };
            C09KL c09kl = this.LJIIIIZZ;
            if (c09kl == null) {
                synchronized (this) {
                    c09kl = this.LJIIIIZZ;
                    if (c09kl == null) {
                        c09kl = new C09KL();
                        this.LJIIIIZZ = c09kl;
                    }
                }
            }
            c09kl.LIZ = c18uq;
            c09ktArr[1] = c09kl;
            c09ktArr[2] = new C09KT<List<? extends DMUploadImageResult>, Pair<? extends BaseTemplate, ? extends List<? extends C0YC6>>>() { // from class: X.18Xy
                @Override // X.C09KT
                public final Object LIZ(Object obj, C874520YSk c874520YSk) {
                    C0YC6 c0yc6;
                    String secretKey;
                    List list = (List) obj;
                    Function0<Unit> function0 = this.LIZ.LJFF;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    VisualPoetUserCardTemplate visualPoetUserCardTemplateLJFF = C21301918Xx.LJFF(this.LIZ.LJ, list);
                    C21301918Xx c21301918Xx = this.LIZ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    int i = 0;
                    for (Object obj2 : list) {
                        int i2 = i + 1;
                        String uri = null;
                        if (i >= 0) {
                            DMUploadImageResult dMUploadImageResult = (DMUploadImageResult) obj2;
                            C21295818Vo c21295818Vo = (C21295818Vo) C13LP.LJJJLZIJ(i, c21301918Xx.LJ.LJFF);
                            if (c21295818Vo != null) {
                                c0yc6 = C21301918Xx.LJ(c21295818Vo);
                            } else {
                                c0yc6 = new C0YC6(null, null, null, 0L, null, 0, new LinkedHashMap(), 0, null, null, null, null, null, null, null, null);
                            }
                            DMEncryptedImageContent dMEncryptedImageContent = dMUploadImageResult.decryptData;
                            if (dMEncryptedImageContent != null) {
                                secretKey = dMEncryptedImageContent.getSecretKey();
                            } else {
                                secretKey = null;
                            }
                            c0yc6.setSecretKey(secretKey);
                            DMEncryptedImageContent dMEncryptedImageContent2 = dMUploadImageResult.decryptData;
                            if (dMEncryptedImageContent2 != null) {
                                uri = dMEncryptedImageContent2.getUri();
                            }
                            c0yc6.setUri(uri);
                            arrayList.add(Collections.singletonList(c0yc6));
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    return new Pair(visualPoetUserCardTemplateLJFF, C15438062q.LJIJJLI(arrayList));
                }
            };
            listSingletonList = C1697810uHb.LJIIJJI(c09ktArr);
        } else {
            listSingletonList = Collections.singletonList(new C09KT<Void, Pair<? extends BaseTemplate, ? extends List<? extends C0YC6>>>() { // from class: X.18Y1
                @Override // X.C09KT
                public final Object LIZ(Object obj, C874520YSk c874520YSk) {
                    Function0<Unit> function0 = this.LIZ.LJFF;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    C18UZ c18uz2 = this.LIZ.LJ;
                    C13BV c13bv = C13BV.INSTANCE;
                    return new Pair(C21301918Xx.LJFF(c18uz2, c13bv), c13bv);
                }
            });
        }
        this.LJII = listSingletonList;
    }
}
