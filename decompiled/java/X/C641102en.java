package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02en, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C641102en extends Message<C641102en, C641202eo> {
    public static final ProtoAdapter<C641102en> ADAPTER = new ProtoAdapter<C641102en>() { // from class: X.02em
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C641102en decode(ProtoReader protoReader) {
            C641102en c641102en = new C641102en();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c641102en.close_page = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c641102en.jump_schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c641102en;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C641102en c641102en) {
            C641102en c641102en2 = c641102en;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c641102en2.jump_schema) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c641102en2.close_page) + c641102en2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C641102en c641102en) {
        }
    };
    public Boolean close_page;
    public String jump_schema;

    public C641102en() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C641202eo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
