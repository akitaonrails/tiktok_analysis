package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C653502gn extends Message<C653502gn, C653602go> {
    public static final ProtoAdapter<C653502gn> ADAPTER = new ProtoAdapter<C653502gn>() { // from class: X.02gm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C653502gn decode(ProtoReader protoReader) {
            C653502gn c653502gn = new C653502gn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c653502gn.can_boost_meme = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c653502gn.is_meme = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c653502gn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C653502gn c653502gn) {
            C653502gn c653502gn2 = c653502gn;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c653502gn2.is_meme) + protoAdapter.encodedSizeWithTag(2, c653502gn2.can_boost_meme) + c653502gn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C653502gn c653502gn) {
            C653502gn c653502gn2 = c653502gn;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c653502gn2.is_meme);
            protoAdapter.encodeWithTag(protoWriter, 2, c653502gn2.can_boost_meme);
            protoWriter.writeBytes(c653502gn2.unknownFields());
        }
    };
    public Integer can_boost_meme;
    public Integer is_meme;

    public C653502gn() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C653602go newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
