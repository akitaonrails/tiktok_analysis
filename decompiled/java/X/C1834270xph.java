package X;

import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834270xph extends C09AY implements Function1<C1834780xqW, C1834780xqW> {
    public final /* synthetic */ List<C1833730xop> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ TextStickerConfig LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1834270xph(List<C1833730xop> list, long j, boolean z, TextStickerConfig textStickerConfig) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = textStickerConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1834780xqW invoke(C1834780xqW c1834780xqW) {
        C1834780xqW c1834780xqW2 = c1834780xqW;
        List<C1833730xop> list = this.LL;
        long j = this.LLILLJJLI;
        boolean z = this.LLILLL;
        TextStickerConfig textStickerConfig = this.LLILZ;
        int i = 10;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C1833730xop c1833730xop : list) {
            List<C1834580xqC> list2 = c1833730xop.LLILLL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, i));
            for (C1834580xqC c1834580xqCLIZ : list2) {
                if (c1834580xqCLIZ.LLILZ == j) {
                    c1834580xqCLIZ = C1834580xqC.LIZ(c1834580xqCLIZ, 0, false, null, z, textStickerConfig, -1, 57);
                }
                arrayList2.add(c1834580xqCLIZ);
                i = 10;
            }
            arrayList.add(C1833730xop.LIZ(c1833730xop, null, arrayList2, 11));
        }
        return C1834780xqW.LIZ(c1834780xqW2, null, null, new C291001Au(arrayList), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524283);
    }
}
