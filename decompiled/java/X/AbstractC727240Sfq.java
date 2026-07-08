package X;

import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC727240Sfq<SUBSCRIBE_DATA, OUTPUT_DATA> {
    public final ConcurrentHashMap<InterfaceC726980SfQ, Set<StoryReceiver>> LIZ = new ConcurrentHashMap<>();
    public final C11PQ<C727230Sfp<SUBSCRIBE_DATA, OUTPUT_DATA>> LIZIZ = new C11PQ<>();
    public final C727250Sfr LIZJ = new InterfaceC1627390sS1(this) { // from class: X.0Sfr
        @Override // X.InterfaceC1627390sS1
        public final boolean test(Object obj, Object obj2) {
            C727230Sfp c727230Sfp = (C727230Sfp) obj;
            C727230Sfp c727230Sfp2 = (C727230Sfp) obj2;
            InterfaceC2217241BqE[] interfaceC2217241BqEArr = c727230Sfp2.LIZLLL;
            if (interfaceC2217241BqEArr == null) {
                return false;
            }
            for (InterfaceC2217241BqE interfaceC2217241BqE : interfaceC2217241BqEArr) {
                if (interfaceC2217241BqE != null && Intrinsics.LJFF(interfaceC2217241BqE.get(c727230Sfp2.LIZIZ), interfaceC2217241BqE.get(c727230Sfp.LIZIZ))) {
                    return true;
                }
            }
            return false;
        }
    };

    public abstract List LIZ(UserStory userStory, UserStory userStory2);

    public abstract Object LIZJ(SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data);

    public final C19475711Hn LIZLLL() {
        C11PQ<C727230Sfp<SUBSCRIBE_DATA, OUTPUT_DATA>> c11pq = this.LIZIZ;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    public final void LJ(InterfaceC726980SfQ interfaceC726980SfQ, StoryReceiver storyReceiver) {
        ConcurrentHashMap<InterfaceC726980SfQ, Set<StoryReceiver>> concurrentHashMap = this.LIZ;
        Set<StoryReceiver> linkedHashSet = concurrentHashMap.get(interfaceC726980SfQ);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        C19719612Di.LJJIII(linkedHashSet, new AwS590S0100000_11(storyReceiver, 6), true);
        linkedHashSet.add(storyReceiver);
        concurrentHashMap.put(interfaceC726980SfQ, linkedHashSet);
    }

    public final void LIZIZ(UserStory userStory, UserStory userStory2, Object obj) {
        List listLIZ = LIZ(userStory, userStory2);
        if (!listLIZ.isEmpty()) {
            this.LIZIZ.onNext(new C727230Sfp<>(listLIZ, userStory2, obj, null));
        }
    }
}
