package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.DiyPropVideoStickerHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.18i1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class C21357118i1 extends C2217421BqW implements Function2<Boolean, List<MediaModel>, Unit> {
    public C21357118i1(Object obj) {
        super(2, obj, DiyPropVideoStickerHandler.class, "onMediaPageLoaded", "onMediaPageLoaded(ZLjava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.18i3] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
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
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, List<MediaModel> list) {
        ?? arrayList;
        boolean zBooleanValue = bool.booleanValue();
        List<MediaModel> list2 = list;
        DiyPropVideoStickerHandler diyPropVideoStickerHandler = (DiyPropVideoStickerHandler) this.receiver;
        ((ArrayList) diyPropVideoStickerHandler.LLJJJJJIL).clear();
        if (zBooleanValue) {
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (MediaModel mediaModel : list2) {
                    ((ArrayList) diyPropVideoStickerHandler.LLJJJJJIL).add(mediaModel.LJFF());
                    C21356918hz c21356918hz = new C21356918hz(mediaModel.LJFF(), mediaModel.duration);
                    c21356918hz.LJI = 2;
                    c21356918hz.LJIILIIL = mediaModel.fileName;
                    c21356918hz.LJIIJJI = mediaModel.width;
                    c21356918hz.LJIIL = mediaModel.height;
                    c21356918hz.LJIILJJIL = mediaModel.mimeType;
                    arrayList.add(c21356918hz);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            ?? r3 = diyPropVideoStickerHandler.LLJJIJI;
            if (r3 != 0) {
                r3.clearData();
                r3.LJIILJJIL(arrayList);
                String str = diyPropVideoStickerHandler.LLJJIJIL;
                if (str.length() > 0) {
                    r3.LJII(str, false);
                }
                if (arrayList.isEmpty()) {
                    r3.LIZ();
                }
            }
        }
        return Unit.LIZ;
    }
}
