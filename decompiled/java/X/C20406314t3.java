package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: renamed from: X.14t3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20406314t3 extends C09AY implements Function0<C20400014s2> {
    public final /* synthetic */ C20396414rS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20406314t3(C20396414rS c20396414rS) {
        super(0);
        this.LL = c20396414rS;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.14s2] */
    @Override // kotlin.jvm.functions.Function0
    public final C20400014s2 invoke() {
        final C20396414rS c20396414rS = this.LL;
        return new AbstractC21342018fa() { // from class: X.14s2
            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return c20396414rS.LLJILJILJ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return ((ArrayList) c20396414rS.LLJILLL).size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                if (i >= ((ArrayList) c20396414rS.LLJILLL).size() || i2 >= c20396414rS.LLJILJILJ.size()) {
                    return false;
                }
                PlaybookTagAggregation playbookTagAggregation = (PlaybookTagAggregation) ListProtector.get(c20396414rS.LLJILLL, i);
                PlaybookTagAggregation playbookTagAggregation2 = (PlaybookTagAggregation) ListProtector.get(c20396414rS.LLJILJILJ, i2);
                if ((playbookTagAggregation instanceof PlaybookTagAggregation) && (playbookTagAggregation2 instanceof PlaybookTagAggregation)) {
                    if (playbookTagAggregation.playbookFirstLevelTagType != playbookTagAggregation2.playbookFirstLevelTagType || !Intrinsics.LJFF(playbookTagAggregation.firstLevelTagTranslatedName, playbookTagAggregation2.firstLevelTagTranslatedName)) {
                        return false;
                    }
                    return true;
                }
                return Intrinsics.LJFF(playbookTagAggregation, playbookTagAggregation2);
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                if (i >= ((ArrayList) c20396414rS.LLJILLL).size() || i2 >= c20396414rS.LLJILJILJ.size() || ListProtector.get(c20396414rS.LLJILLL, i).getClass() != ListProtector.get(c20396414rS.LLJILJILJ, i2).getClass()) {
                    return false;
                }
                return true;
            }
        };
    }
}
