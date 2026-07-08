package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.EcSearchDealsSkinData;
import com.ss.android.ugc.aweme.search.model.Image;
import com.ss.android.ugc.aweme.search.model.ThemeImage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QV3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QV3 {
    public static EcSearchDealsSkinData LIZ;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static ThemeImage LIZ(ThemeImage themeImage, EnumC1769850w9n enumC1769850w9n) {
        Object c098200Yq;
        Image imageCopy;
        ArrayList arrayList;
        Image imageCopy2 = null;
        ArrayList arrayList2 = null;
        if (themeImage == null) {
            return null;
        }
        try {
            Image image = themeImage.light;
            Image image2 = themeImage.dark;
            String str = "";
            if (image != null) {
                String str2 = image.uri;
                if (str2 == null) {
                    str2 = "";
                }
                C1334210kp9.LIZIZ(str2, enumC1769850w9n, null, null, false, false, null, null);
                List<String> list = image.urlList;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (String str3 : list) {
                        C1334210kp9.LIZIZ(str3, enumC1769850w9n, null, null, false, false, null, null);
                        arrayList.add(str3);
                    }
                } else {
                    arrayList = null;
                }
                imageCopy = image.copy(image.ImageHeight, image.ImageWidth, image.mimetype, image.thumbUri, image.thumbUrlList, str2, arrayList);
            } else {
                imageCopy = null;
            }
            if (image2 != null) {
                String str4 = image2.uri;
                if (str4 != null) {
                    str = str4;
                }
                C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
                List<String> list2 = image2.urlList;
                if (list2 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (String str5 : list2) {
                        C1334210kp9.LIZIZ(str5, enumC1769850w9n, null, null, false, false, null, null);
                        arrayList2.add(str5);
                    }
                }
                imageCopy2 = image2.copy(image2.ImageHeight, image2.ImageWidth, image2.mimetype, image2.thumbUri, image2.thumbUrlList, str, arrayList2);
            }
            c098200Yq = themeImage.copy(imageCopy, imageCopy2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C1AF0.LIZJ("EcSearchSkinDataManager:mapToImageWithEcBizScene");
            c098200Yq = themeImage;
        }
        return (ThemeImage) c098200Yq;
    }
}
