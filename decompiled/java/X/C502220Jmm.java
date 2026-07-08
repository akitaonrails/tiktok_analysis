package X;

import com.bytedance.android.livesdk.chatroom.api.SpaceTopicCategory;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicContent;
import com.bytedance.android.livesdk.chatroom.api.SpaceTopicInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.TopicByCategory;

/* JADX INFO: renamed from: X.0Jmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502220Jmm extends C09AY implements Function1<SpaceTopicCategory, Unit> {
    public final /* synthetic */ SubSpaceNewPostVM LL;
    public final /* synthetic */ C502390Jn3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502220Jmm(SubSpaceNewPostVM subSpaceNewPostVM, C502390Jn3 c502390Jn3) {
        super(1);
        this.LL = subSpaceNewPostVM;
        this.LLILLJJLI = c502390Jn3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SpaceTopicCategory spaceTopicCategory) {
        ArrayList<AbstractC503810JpL> arrayList;
        SpaceTopicCategory spaceTopicCategory2;
        SpaceTopicContent spaceTopicContent;
        C501820Jm8 c501820Jm8;
        List<TopicByCategory> list;
        C501820Jm8 c501820Jm82;
        SpaceTopicInfo spaceTopicInfo;
        C501820Jm8 c501820Jm83;
        SpaceTopicInfo spaceTopicInfo2;
        C501820Jm8 c501820Jm84;
        C501820Jm8 c501820Jm85;
        SpaceTopicCategory spaceTopicCategory3 = spaceTopicCategory;
        SubSpaceNewPostVM subSpaceNewPostVM = this.LL;
        C502390Jn3 c502390Jn3 = this.LLILLJJLI;
        C502390Jn3 c502390Jn32 = subSpaceNewPostVM.LLILLL;
        if (c502390Jn32 != null && (arrayList = c502390Jn32.LL) != null && arrayList.size() != 0) {
            Object obj = ListProtector.get(arrayList, 0);
            arrayList.clear();
            arrayList.add((AbstractC503810JpL) obj);
            if (spaceTopicCategory3.topicCategoryId == -1211) {
                arrayList.addAll(subSpaceNewPostVM.vQ2());
            } else {
                arrayList.add(new C502480JnC());
                C501810Jm7 c501810Jm7XQ2 = subSpaceNewPostVM.xQ2();
                if (c501810Jm7XQ2 != null && (c501820Jm83 = c501810Jm7XQ2.LL) != null && (spaceTopicInfo2 = c501820Jm83.LJ) != null) {
                    spaceTopicCategory2 = spaceTopicInfo2.spaceTopicCategory;
                } else {
                    spaceTopicCategory2 = null;
                }
                C501810Jm7 c501810Jm7XQ22 = subSpaceNewPostVM.xQ2();
                if (c501810Jm7XQ22 != null && (c501820Jm82 = c501810Jm7XQ22.LL) != null && (spaceTopicInfo = c501820Jm82.LJ) != null) {
                    spaceTopicContent = spaceTopicInfo.spaceTopicContent;
                } else {
                    spaceTopicContent = null;
                }
                if (spaceTopicCategory2 != null && spaceTopicCategory2.topicCategoryId == spaceTopicCategory3.topicCategoryId && spaceTopicContent != null) {
                    arrayList.add(new C502470JnB(spaceTopicContent));
                }
                C501810Jm7 c501810Jm7XQ23 = subSpaceNewPostVM.xQ2();
                if (c501810Jm7XQ23 != null && (c501820Jm8 = c501810Jm7XQ23.LL) != null && (list = c501820Jm8.LIZ) != null) {
                    for (TopicByCategory topicByCategory : list) {
                        SpaceTopicCategory spaceTopicCategory4 = topicByCategory.topicCategory;
                        if (spaceTopicCategory4 != null && spaceTopicCategory4.topicCategoryId == spaceTopicCategory3.topicCategoryId) {
                            for (SpaceTopicContent spaceTopicContent2 : topicByCategory.topicContentList) {
                                if (spaceTopicContent == null || spaceTopicContent.topicContentId != spaceTopicContent2.topicContentId) {
                                    arrayList.add(new C502470JnB(spaceTopicContent2));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.add(new C502400Jn4(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
            C501810Jm7 c501810Jm7XQ24 = subSpaceNewPostVM.xQ2();
            if (c501810Jm7XQ24 != null && (c501820Jm85 = c501810Jm7XQ24.LL) != null) {
                c501820Jm85.LIZIZ = spaceTopicCategory3;
            }
            C501810Jm7 c501810Jm7XQ25 = subSpaceNewPostVM.xQ2();
            if (c501810Jm7XQ25 != null && (c501820Jm84 = c501810Jm7XQ25.LL) != null) {
                c501820Jm84.LIZLLL = null;
            }
            c502390Jn3.notifyDataSetChanged();
            subSpaceNewPostVM.withState(new C502180Jmi(subSpaceNewPostVM, null));
            subSpaceNewPostVM.setState(new C502210Jml());
        }
        return Unit.LIZ;
    }
}
