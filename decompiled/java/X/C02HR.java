package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HR extends Message<C02HR, C571002Km> {
    public static final ProtoAdapter<C02HR> ADAPTER = new ProtoAdapter<C02HR>() { // from class: X.02HQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HR decode(ProtoReader protoReader) {
            C02HR c02hr = new C02HR();
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
                                    c02hr.social_avatar_expression_tag = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02hr.social_avatar_background_tag = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02hr.avatar_choice = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02hr.avatar_source = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HR c02hr) {
            C02HR c02hr2 = c02hr;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02hr2.avatar_source) + protoAdapter.encodedSizeWithTag(2, c02hr2.avatar_choice) + protoAdapter.encodedSizeWithTag(3, c02hr2.social_avatar_background_tag) + protoAdapter.encodedSizeWithTag(4, c02hr2.social_avatar_expression_tag) + c02hr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02HR c02hr) {
            C02HR c02hr2 = c02hr;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02hr2.avatar_source);
            protoAdapter.encodeWithTag(protoWriter, 2, c02hr2.avatar_choice);
            protoAdapter.encodeWithTag(protoWriter, 3, c02hr2.social_avatar_background_tag);
            protoAdapter.encodeWithTag(protoWriter, 4, c02hr2.social_avatar_expression_tag);
            protoWriter.writeBytes(c02hr2.unknownFields());
        }
    };
    public Integer avatar_choice;
    public Integer avatar_source;
    public Integer social_avatar_background_tag;
    public Integer social_avatar_expression_tag;

    public C02HR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C571002Km newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
