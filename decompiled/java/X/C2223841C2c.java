package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223841C2c extends Message<C2223841C2c, C2223851C2d> {
    public static final ProtoAdapter<C2223841C2c> ADAPTER = new ProtoAdapter<C2223841C2c>() { // from class: X.1C2b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223841C2c decode(ProtoReader protoReader) {
            C2223841C2c c2223841C2c = new C2223841C2c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c2223841C2c.unuse_percentage = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2223841C2c.unuse_amount = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2223841C2c.restriction_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223841C2c.is_limited = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223841C2c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223841C2c c2223841C2c) {
            C2223841C2c c2223841C2c2 = c2223841C2c;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c2223841C2c2.is_limited) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2223841C2c2.restriction_text);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2223841C2c2.unuse_amount) + protoAdapter.encodedSizeWithTag(4, c2223841C2c2.unuse_percentage) + c2223841C2c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223841C2c c2223841C2c) {
        }
    };
    public Boolean is_limited;
    public String restriction_text;
    public Long unuse_amount;
    public Long unuse_percentage;

    public C2223841C2c() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223851C2d newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
