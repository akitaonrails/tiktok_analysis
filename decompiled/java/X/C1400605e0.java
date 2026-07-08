package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05e0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager$internalReorderCollections$2", f = "StoryHighlightsMyDataManager.kt", l = {}, m = "invokeSuspend")
public final class C1400605e0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryHighlightsMyDataManager LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400605e0(StoryHighlightsMyDataManager storyHighlightsMyDataManager, String str, String str2, InterfaceC1364105Vn<? super C1400605e0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyHighlightsMyDataManager;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1400605e0(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.internalReorderCollections$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2252321DDq c2252321DDq = this.LL.LIZIZ;
        Object value = c2252321DDq.getValue();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        List list = (List) value;
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((StoryHighlightCollection) it2.next()).collectionId, str2)) {
                if (i2 != -1) {
                    ArrayList arrayList = new ArrayList(list);
                    Object objRemove = ListProtector.remove(arrayList, i2);
                    if (str == null) {
                        i = 0;
                    } else {
                        Iterator it3 = arrayList.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(((StoryHighlightCollection) it3.next()).collectionId, str)) {
                                if (i3 != -1) {
                                    i = i3 + 1;
                                }
                            } else {
                                i3++;
                            }
                        }
                    }
                    ListProtector.add(arrayList, C13LZ.LJ(i, 0, arrayList.size()), objRemove);
                    list = arrayList;
                }
            } else {
                i2++;
            }
        }
        c2252321DDq.setValue(list);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.internalReorderCollections$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
