package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: renamed from: X.0YKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC872340YKa implements WireEnum {
    CmdTypeUnknown(0),
    CmdTypeMarkConversationRead(1),
    CmdTypeDeleteMessage(2),
    CmdTypeDeleteConversation(3),
    CmdTypeUpdateConvSetting(4),
    CmdTypeUpdateConvCoreInfo(6),
    CmdTypeUpdateConvParticipant(7),
    CmdTypeFirstMessage(8),
    CmdTypeTriggerConvPull(100),
    CmdTypeSyncMsgIntoStrangerInbox(101);

    public static final ProtoAdapter<EnumC872340YKa> ADAPTER = new EnumAdapter<EnumC872340YKa>() { // from class: X.0YKb
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC872340YKa.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC872340YKa fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                if (i != 7) {
                                    if (i != 8) {
                                        if (i != 100) {
                                            if (i != 101) {
                                                return null;
                                            }
                                            return CmdTypeSyncMsgIntoStrangerInbox;
                                        }
                                        return CmdTypeTriggerConvPull;
                                    }
                                    return CmdTypeFirstMessage;
                                }
                                return CmdTypeUpdateConvParticipant;
                            }
                            return CmdTypeUpdateConvCoreInfo;
                        }
                        return CmdTypeUpdateConvSetting;
                    }
                    return CmdTypeDeleteConversation;
                }
                return CmdTypeDeleteMessage;
            }
            return CmdTypeMarkConversationRead;
        }
        return CmdTypeUnknown;
    }

    public static EnumC872340YKa valueOf(String str) {
        return (EnumC872340YKa) C08FF.LIZ(EnumC872340YKa.class, str);
    }

    EnumC872340YKa(int i) {
        this.LL = i;
    }
}
