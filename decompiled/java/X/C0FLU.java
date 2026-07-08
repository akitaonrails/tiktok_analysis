package X;

import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FLU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0FLU extends C2217421BqW implements Function1<HashtagStruct, Unit> {
    public C0FLU(Object obj) {
        super(1, obj, C0FLR.class, "hashtagShowCallback", "hashtagShowCallback(Lcom/ss/android/ugc/aweme/sticker/data/HashtagStruct;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(HashtagStruct hashtagStruct) {
        C0FGR c0fgrLIZJ;
        String hashtagName;
        HashtagStruct hashtagStruct2 = hashtagStruct;
        C0FF8 c0ff8 = (C0FF8) ((C0FLR) this.receiver).LIZLLL.getValue();
        if (c0ff8 != null && (c0fgrLIZJ = c0ff8.LIZJ()) != null) {
            if (hashtagStruct2 == null || (hashtagName = hashtagStruct2.getHashtagName()) == null) {
                hashtagName = "";
            }
            c0fgrLIZJ.LIZLLL(new C387650FHv("caption_mode", hashtagName));
        }
        return Unit.LIZ;
    }
}
