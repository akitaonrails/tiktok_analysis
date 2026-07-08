package X;

import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgContent;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeInlineMsgTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeInlineMessageContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageContent;

/* JADX INFO: renamed from: X.06Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06Y7 {
    public static SystemContent LIZ(C869590Y9l c869590Y9l) {
        FakeInlineMessageContent fakeInlineMessageContent;
        SystemContent systemContent;
        FakeMessage fakeMessage;
        Object localCache = c869590Y9l.getLocalCache(501);
        FakeMessageContent fakeContent = null;
        if (!(localCache instanceof SystemContent) || (systemContent = (SystemContent) localCache) == null) {
            if (C068M.LIZ(c869590Y9l)) {
                FakeInlineMsgContent fakeInlineMsgContent = (FakeInlineMsgContent) C051M.LIZIZ(FakeInlineMsgContent.class, c869590Y9l.getContent());
                if (fakeInlineMsgContent == null) {
                    return null;
                }
                int size = fakeInlineMsgContent.templates.size();
                SystemContent.Key[] keyArr = new SystemContent.Key[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    keyArr[i2] = new SystemContent.Key();
                }
                for (FakeInlineMsgTemplate fakeInlineMsgTemplate : fakeInlineMsgContent.templates) {
                    int i3 = i + 1;
                    if (i >= 0) {
                        FakeInlineMsgTemplate fakeInlineMsgTemplate2 = fakeInlineMsgTemplate;
                        SystemContent.Key key = new SystemContent.Key();
                        key.setKey(fakeInlineMsgTemplate2.key);
                        key.setAction(fakeInlineMsgTemplate2.action);
                        key.setName(fakeInlineMsgTemplate2.name);
                        key.setLink(fakeInlineMsgTemplate2.link);
                        key.setExtra(fakeInlineMsgTemplate2.extra);
                        keyArr[i] = key;
                        i = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                SystemContent systemContent2 = new SystemContent();
                systemContent2.setTips(fakeInlineMsgContent.content);
                systemContent2.setTemplate(keyArr);
                return systemContent2;
            }
            if ((c869590Y9l instanceof FakeMessage) && (fakeMessage = (FakeMessage) c869590Y9l) != null) {
                fakeContent = fakeMessage.getFakeContent();
            }
            if (!(fakeContent instanceof FakeInlineMessageContent) || (fakeInlineMessageContent = (FakeInlineMessageContent) fakeContent) == null || (systemContent = fakeInlineMessageContent.toSystemContent()) == null) {
                return (SystemContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, SystemContent.class);
            }
        }
        return systemContent;
    }
}
