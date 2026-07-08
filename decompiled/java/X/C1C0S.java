package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0S, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0S extends Message<C1C0S, C1C0T> {
    public static final ProtoAdapter<C1C0S> ADAPTER = new ProtoAdapter<C1C0S>() { // from class: X.1C0R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C0S decode(ProtoReader protoReader) {
            C1C0S c1c0s = new C1C0S();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c0s.enable_profile_button = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1c0s.enable_fyp_label = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1c0s.enable_fyp_button = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0s;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C0S c1c0s) {
            C1C0S c1c0s2 = c1c0s;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c1c0s2.enable_fyp_button) + protoAdapter.encodedSizeWithTag(2, c1c0s2.enable_fyp_label) + protoAdapter.encodedSizeWithTag(3, c1c0s2.enable_profile_button) + c1c0s2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C0S c1c0s) {
            C1C0S c1c0s2 = c1c0s;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c0s2.enable_fyp_button);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c0s2.enable_fyp_label);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c0s2.enable_profile_button);
            protoWriter.writeBytes(c1c0s2.unknownFields());
        }
    };
    public Boolean enable_fyp_button;
    public Boolean enable_fyp_label;
    public Boolean enable_profile_button;

    @Override // com.squareup.wire.Message
    public C1C0T newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1C0S(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public C1C0S(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_fyp_button = bool;
        this.enable_fyp_label = bool2;
        this.enable_profile_button = bool3;
    }
}
