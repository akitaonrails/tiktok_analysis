package X;

import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageKeyComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.InlineMessageTipComponent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1CQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2230181CQm {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public static final InlineMessageTipComponent LIZ(C2230151CQj c2230151CQj) {
        ?? arrayList;
        InlineMessageKeyComponent inlineMessageKeyComponent;
        EnumC1710806mw enumC1710806mw;
        if (c2230151CQj == null) {
            return new InlineMessageTipComponent(0);
        }
        String str = c2230151CQj.tips;
        List<C2230191CQn> list = c2230151CQj.template;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C2230191CQn c2230191CQn : list) {
                if (c2230191CQn == null) {
                    inlineMessageKeyComponent = new InlineMessageKeyComponent(0);
                } else {
                    String str2 = c2230191CQn.key;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str4 = c2230191CQn.name;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = c2230191CQn.link;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    int i = C2230221CQq.LIZIZ[c2230191CQn.action.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            enumC1710806mw = EnumC1710806mw.GROUP_SHOT_RETRY;
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        enumC1710806mw = EnumC1710806mw.SCHEMA;
                    }
                    inlineMessageKeyComponent = new InlineMessageKeyComponent(str2, str4, str3, enumC1710806mw);
                }
                arrayList.add(inlineMessageKeyComponent);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return new InlineMessageTipComponent(str, arrayList);
    }
}
