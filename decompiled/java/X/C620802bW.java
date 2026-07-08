package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C620802bW extends Message<C620802bW, C620902bX> {
    public static final ProtoAdapter<C620802bW> ADAPTER = new ProtoAdapter<C620802bW>() { // from class: X.02bV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C620802bW decode(ProtoReader protoReader) {
            C620802bW c620802bW = new C620802bW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c620802bW.mute_desc = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c620802bW.is_mute = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c620802bW;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C620802bW c620802bW) {
            C620802bW c620802bW2 = c620802bW;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c620802bW2.is_mute) + ProtoAdapter.STRING.encodedSizeWithTag(2, c620802bW2.mute_desc) + c620802bW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C620802bW c620802bW) {
            C620802bW c620802bW2 = c620802bW;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c620802bW2.is_mute);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c620802bW2.mute_desc);
            protoWriter.writeBytes(c620802bW2.unknownFields());
        }
    };
    public Boolean is_mute;
    public String mute_desc;

    public C620802bW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C620902bX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
